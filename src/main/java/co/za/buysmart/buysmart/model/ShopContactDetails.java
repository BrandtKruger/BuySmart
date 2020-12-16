package co.za.buysmart.buysmart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Entity
@Table(name = "shopcontactdetails")
public class ShopContactDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@OneToOne(mappedBy = "shopContactDetails")
    private Shop shop;
	@Size(min = 10, max = 10, message
			= "Phone Number Me must be 10characters")
	private String shopPhoneNumber;
	@Email(message = "Email should be valid")
	private String shopEMail;
	
	public Long getShopContactDetailsId() {
		return id;
	}
	public void setShopContactDetailsId(Long shopContactDetailsId) {
		this.id = shopContactDetailsId;
	}
	public String getShopPhoneNumber() {
		return shopPhoneNumber;
	}
	public void setShopPhoneNumber(String shopPhoneNumber) {
		this.shopPhoneNumber = shopPhoneNumber;
	}
	public String getShopEMail() {
		return shopEMail;
	}
	public void setShopEMail(String shopEMail) {
		this.shopEMail = shopEMail;
	}
	
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}

}
