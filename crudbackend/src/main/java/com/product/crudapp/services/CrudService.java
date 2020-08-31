package com.product.crudapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.crudapp.model.Product;
import com.product.crudapp.repo.CrudRepo;

@Service
public class CrudService {
	
	@Autowired
	private CrudRepo repo;
	
    public List<Product> fetchproductList(){
    	
    	return repo.findAll();
    }

    
    public Product saveProductToDB(Product product)
    {
    	return repo.save(product);
    }
    
    public Optional<Product> fetchProductById(double id)
    {
    	return repo.findById(id);
    }
    
    public String deleteProductById(double id)
    {
    	String result;
    	try {
    		repo.deleteById(id);
    		result="Record successfully deleted";
    	}catch (Exception e) {
			// TODO: handle exception
    		result="Record with this id is not deleted";
		}
    	return result;
    }
}	
