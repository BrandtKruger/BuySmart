package co.za.buysmart.buysmart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.za.buysmart.buysmart.model.Shop;
import co.za.buysmart.buysmart.persistance.ShopRepository;

@Service
public class ShopService {
	
	@Autowired
	private ShopRepository shopRepository;
	
	public void addShop(Shop shop) {
		shopRepository.save(shop);
	}
	
	public Shop updateShop(Shop shop) {
		shopRepository.save(shop);
		return shop;
	}

	public Shop getShopDetails(Long shopId) {
		Optional<Shop> shop = shopRepository.findById(shopId);
		return shop.get();
	}
	
	public List<Shop> getAllShops(){
		return shopRepository.findAll();
	}
	
	public void deleteShop(Long shopId) {
		shopRepository.deleteById(shopId);
	}

}
