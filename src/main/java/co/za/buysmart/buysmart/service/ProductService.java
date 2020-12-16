package co.za.buysmart.buysmart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.za.buysmart.buysmart.model.Product;
import co.za.buysmart.buysmart.persistance.ProductRespository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRespository productRepo;
	
	public List<Product> getAllProducts(){
		return productRepo.findAll();
	}
	
	public Product getProductById(Long productId) {
		return productRepo.getOne(productId);
	}
	
	public void addProduct(Product product) {
		productRepo.save(product);	
	}
	
	public void updateProduct(Product product) {
		productRepo.save(product);
	}
	
	public void deleteProduct(Long id) {
		productRepo.deleteById(id);
	}

}
