package co.za.buysmart.buysmart.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

import co.za.buysmart.buysmart.model.Product;

public interface ProductRespository extends JpaRepository<Product, Long>{
	

}
