package com.example.demo;

import com.example.demo.model.UpdateExcel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.example.demo.model.UpdateExcel.setSupplierExcel;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws Exception{
		SpringApplication.run(DemoApplication.class, args);
	}

}
