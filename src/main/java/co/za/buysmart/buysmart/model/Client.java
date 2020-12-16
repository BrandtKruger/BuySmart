package co.za.buysmart.buysmart.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "client")
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotEmpty(message = "Client Name cannot be empty")
	private String clientName;
	@NotEmpty(message = "Client Surname Name cannot be empty")
	private String clientSurname;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "clientContactDetailsId", referencedColumnName = "id")
	private ClientContactDetails clientContactDetails;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "clientAddressId", referencedColumnName = "id")
	private ClientAddress clientAddress;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getClientSurname() {
		return clientSurname;
	}
	public void setClientSurname(String clientSurname) {
		this.clientSurname = clientSurname;
	}
	public ClientContactDetails getClientContactDetails() {
		return clientContactDetails;
	}
	public void setClientContactDetails(ClientContactDetails clientContactDetails) {
		this.clientContactDetails = clientContactDetails;
	}
	public ClientAddress getClientAddress() {
		return clientAddress;
	}
	public void setClientAddress(ClientAddress clientAddress) {
		this.clientAddress = clientAddress;
	}

	
}
