package co.za.buysmart.buysmart.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

import co.za.buysmart.buysmart.model.Shop;

public interface ShopRepository extends JpaRepository < Shop, Long >{

}
