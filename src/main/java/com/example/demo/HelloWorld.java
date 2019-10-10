package com.example.demo;

import com.example.demo.model.*;
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
    @CrossOrigin(origins = "*")
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


    @GetMapping("/suppliers/all")
    @CrossOrigin(origins = "*")
    public List<Supplier> allSupplier(){
        return supplierRepo.findAll();
    }

    @GetMapping("/suppliers/all/name")
    @CrossOrigin(origins = "*")
    public List<NameOnly> allSupplierName(){
        return supplierRepo.findAllBy();
    }

    @PostMapping(value ="/suppliers/save", consumes = "application/x-www-form-urlencoded")
    @CrossOrigin(origins = "*")
    public Supplier createSupplier(Supplier data){
        supplierRepo.save(data);

        return data;
    }

    @PostMapping(value ="/suppliers/save", consumes = "application/json")
    @CrossOrigin(origins = "*")
    public Supplier createSupplierPost(@RequestBody  Supplier data){
        supplierRepo.save(data);

        return data;
    }

    @GetMapping("/suppliers/supplier/{id}")
    @CrossOrigin(origins = "*")
    public Supplier showSupplier(@PathVariable String id){
            Long newId = Long.parseLong(id);

            return supplierRepo.getOne(newId);

    }

    @GetMapping("/suppliers/delete/{id}")
    @CrossOrigin(origins = "*")
    public void deleteSupplier (@PathVariable String id) {
        supplierRepo.deleteById(Long.parseLong(id));
    }

    @GetMapping("/suppliers/products/excel")
    @CrossOrigin(origins = "*")
    public void getSupplierExcel() throws Exception{
        List<Supplier> suppliers = allSupplier();
        List<Product> products = allProduct();
        setSupplierExcel(suppliers,products);
    }







//---------------------Product-------------------------------------





    @GetMapping("/products/all")
    @CrossOrigin(origins = "*")
    public List<Product> allProduct(){
        return productRepo.findAll();
    }

    @PostMapping(value ="/products/save", consumes = "application/json")
    @CrossOrigin(origins = "*")
    public Product createProductPost(@RequestBody Product data){

         productRepo.save(data);
        return data;
    }

    @PostMapping(value ="/products/save", consumes = "application/x-www-form-urlencoded")
    @CrossOrigin(origins = "*")
    public Product createProduct(Product data){

        productRepo.save(data);
        return data;
    }

    @GetMapping("/products/product/{id}")
    @CrossOrigin(origins = "*")
    public Product showProduct(@PathVariable String id) {

            Long productId = Long.parseLong(id);

            return productRepo.getOne(productId);

    }

    @GetMapping("/products/delete/{id}")
    @CrossOrigin(origins = "*")
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
