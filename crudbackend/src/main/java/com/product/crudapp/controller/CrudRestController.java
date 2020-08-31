package com.product.crudapp.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.crudapp.model.Product;
import com.product.crudapp.services.CrudService;


@RestController
public class CrudRestController {
	
	@Autowired
	private CrudService service;
	
	@GetMapping("/getproductlist")
	@CrossOrigin(origins="http://localhost:4200")
	public java.util.List<Product> fetchProductList(){
	 java.util.List<Product> products= new ArrayList<Product>();
	 products=service.fetchproductList();
	 return products;
	}
	
	@PostMapping("/addproduct")
	@CrossOrigin(origins="http://localhost:4200")
	public Product saveProduct(@RequestBody Product product){
	 
	 return service.saveProductToDB(product); 
	}
	
	@GetMapping("/getproductbyid/{id}")
	@CrossOrigin(origins="http://localhost:4200")
	public Product fetchProductById(@PathVariable double id){
		
		return service.fetchProductById(id).get();
	}
	
	@DeleteMapping("/deleteproductbyid/{id}")
	@CrossOrigin(origins="http://localhost:4200")
	public String DeleteProductById(@PathVariable double id){
	 
	 return service.deleteProductById(id); 
	}
 

}