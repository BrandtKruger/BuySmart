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
@Table(name = "clientaddress")
public class ClientAddress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@OneToOne(mappedBy = "clientAddress")
    private Client client;
	@NotEmpty(message = "Street Name cannot be empty")
	private String clientStreetName;
	@Min(value = 1, message = "Street Number should not be less than 1")
	private Long clientStreetNumber;
	private String clientComplexName;
	private int clientComplexNumber;
	@NotEmpty(message = "City Name cannot be empty")
	private String clientCityName;
	@NotEmpty(message = "City Code cannot be empty")
	private String clientCityCode;
	
	public Long getClientAddressId() {
		return id;
	}
	public void setClientAddressId(Long clientAddressId) {
		this.id = clientAddressId;
	}
	public String getClientStreetName() {
		return clientStreetName;
	}
	public void setClientStreetName(String clientStreetName) {
		this.clientStreetName = clientStreetName;
	}
	public Long getClientStreetNumber() {
		return clientStreetNumber;
	}
	public void setClientStreetNumber(Long clientStreetNumber) {
		this.clientStreetNumber = clientStreetNumber;
	}
	public String getClientComplexName() {
		return clientComplexName;
	}
	public void setClientComplexName(String clientComplexName) {
		this.clientComplexName = clientComplexName;
	}
	public int getClientComplexNumber() {
		return clientComplexNumber;
	}
	public void setClientComplexNumber(int clientComplexNumber) {
		this.clientComplexNumber = clientComplexNumber;
	}
	public String getClientCityName() {
		return clientCityName;
	}
	public void setClientCityName(String clientCityName) {
		this.clientCityName = clientCityName;
	}
	public String getClientCityCode() {
		return clientCityCode;
	}
	public void setClientCityCode(String clientCityCode) {
		this.clientCityCode = clientCityCode;
	}
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}

}
