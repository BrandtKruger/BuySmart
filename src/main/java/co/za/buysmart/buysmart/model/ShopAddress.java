package co.za.buysmart.buysmart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "shopaddress")
public class ShopAddress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@OneToOne(mappedBy = "shopAddress")
    private Shop shop;
	@Min(value = 1, message = "Street Number should not be less than 1")
	private int shopStreetNumber;
	@NotEmpty(message = "Street Name cannot be empty")
	private String shopStreetName;
	private String shopShoppingCentreName;
	private int shopNumber;
	@NotEmpty(message = "City Name cannot be empty")
	private String shopCityName;
	@NotEmpty(message = "City Code cannot be empty")
	private String shopCityCode;
	
	public int getShopStreetNumber() {
		return shopStreetNumber;
	}
	public void setShopStreetNumber(int shopStreetNumber) {
		this.shopStreetNumber = shopStreetNumber;
	}
	public String getShopStreetName() {
		return shopStreetName;
	}
	public void setShopStreetName(String shopStreetName) {
		this.shopStreetName = shopStreetName;
	}
	public String getShopShoppingCentreName() {
		return shopShoppingCentreName;
	}
	public void setShopShoppingCentreName(String shopShoppingCentreName) {
		this.shopShoppingCentreName = shopShoppingCentreName;
	}
	public int getShopNumber() {
		return shopNumber;
	}
	public void setShopNumber(int shopNumber) {
		this.shopNumber = shopNumber;
	}
	public String getShopCityName() {
		return shopCityName;
	}
	public void setShopCityName(String shopCityName) {
		this.shopCityName = shopCityName;
	}
	public String getShopCityCode() {
		return shopCityCode;
	}
	public void setShopCityCode(String shopCityCode) {
		this.shopCityCode = shopCityCode;
	}
	public Long getShopAddressId() {
		return id;
	}
	public void setShopAddressId(Long shopAddressId) {
		this.id = shopAddressId;
	}

	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}

}
