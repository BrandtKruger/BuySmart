package co.za.buysmart.buysmart.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.hibernate.engine.internal.Collections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.za.buysmart.buysmart.model.Client;
import co.za.buysmart.buysmart.persistance.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository clientRepository;
	
	public void addClient(Client client) {
		clientRepository.save(client);
	}
	
	public Client updateClient(Client client) {
		clientRepository.save(client);
		return client;
	}
	
	public Optional<Client> getClient(Long clientId) {
		return clientRepository.findById(clientId);
	}
	public List<Client> getAllClients(){
		Optional<List<Client>> client =  Optional.ofNullable(clientRepository.findAll());

		return client.get();
	}
	
	public void deleteClient(Long clientid) {
		clientRepository.deleteById(clientid);
	}
}
