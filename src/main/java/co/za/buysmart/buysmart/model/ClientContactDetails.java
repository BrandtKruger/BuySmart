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
@Table(name = "clientcontactdetails")
public class ClientContactDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@OneToOne(mappedBy = "clientContactDetails")
    private Client client;
	@Size(min = 10, max = 12, message
			= "Cell Number Me must be between 10 and 12 characters")
	private String clientCellNumber;
	@Email(message = "Email should be valid")
	private String clientEMail;
	
	public Long getClientConatctDetailsId() {
		return id;
	}
	public void setClientConatctDetailsId(Long clientConatctDetailsId) {
		this.id = clientConatctDetailsId;
	}
	public String getClientCellNumber() {
		return clientCellNumber;
	}
	public void setClientCellNumber(String clientCellNumber) {
		this.clientCellNumber = clientCellNumber;
	}
	public String getClientEMail() {
		return clientEMail;
	}
	public void setClientEMail(String clientEMail) {
		this.clientEMail = clientEMail;
	}

	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}

}
