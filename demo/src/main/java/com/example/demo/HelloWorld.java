package com.example.demo;

import com.example.demo.model.Product;
import com.example.demo.model.ProductRepo;
import com.example.demo.model.Supplier;
import com.example.demo.model.SupplierRepo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static com.example.demo.model.UpdateExcel.setSupplierExcel;

@RestController
public class HelloWorld  {

    @Autowired
    SupplierRepo supplierRepo;

    @Autowired
    ProductRepo productRepo;

    @RequestMapping("/")
    public String index(){

        return "<html>\n" +
                "<head><title>Home Page</title></head>\n" +
                "<body>\n" +
                "<h1>Hello !</h1>\n" +
                "<p>Welcome to <span th:text=\"${appName}\">Our App</span></p>\n" +
                "</body>\n" +
                "</html>";
    }


    @RequestMapping("/2")
    public String index1(){
        return "2";
    }

    //@CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/suppliers/all")
    public List<Supplier> allSupplier(){
        return supplierRepo.findAll();
    }

    @PostMapping(value ="/suppliers/save", consumes = "application/x-www-form-urlencoded")
    public Supplier createSupplier(Supplier data){
        supplierRepo.save(data);

        return data;
    }

    @PostMapping(value ="/suppliers/save", consumes = "application/json")
    public Supplier createSupplierPost(@RequestBody  Supplier data){
        supplierRepo.save(data);

        return data;
    }

    @GetMapping("/suppliers/supplier/{id}")
    public Supplier showSupplier(@PathVariable String id){
            Long newId = Long.parseLong(id);

            return supplierRepo.getOne(newId);

    }

    @GetMapping("/suppliers/delete/{id}")
    public void deleteSupplier (@PathVariable String id) {
        supplierRepo.deleteById(Long.parseLong(id));
    }

    @GetMapping("/suppliers/products/excel")
    public void getSupplierExcel() throws Exception{
        List<Supplier> suppliers = allSupplier();
        List<Product> products = allProduct();
        setSupplierExcel(suppliers,products);
    }







//---------------------Product-------------------------------------





    @GetMapping("/products/all")
    public List<Product> allProduct(){
        return productRepo.findAll();
    }

    @PostMapping(value ="/products/save", consumes = "application/json")
    public Product createProductPost(@RequestBody Product data){

         productRepo.save(data);
        return data;
    }

    @PostMapping(value ="/products/save", consumes = "application/x-www-form-urlencoded")
    public Product createProduct(Product data){

        productRepo.save(data);
        return data;
    }

    @GetMapping("/products/product/{id}")
    public Product showProduct(@PathVariable String id) {

            Long productId = Long.parseLong(id);

            return productRepo.getOne(productId);

    }

    @GetMapping("/products/delete/{id}")
    public void deleteProduct(@PathVariable String id){
        productRepo.deleteById(Long.parseLong(id));
    }



//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    public class OwnException extends Exception {
//
//        public OwnException(int exception, String type) {
//            super(type + " id : " + exception + " is not found");
//        }
//
//    }

//    public Long validateId (String id  ,String type) throws Exception{
//        Long newId = Long.parseLong(id);
//        if(!productRepo.existsById(newId)) {
//            throw new OwnException(newId, type);
//        }
//        return newId;
//
//
//    }


}
