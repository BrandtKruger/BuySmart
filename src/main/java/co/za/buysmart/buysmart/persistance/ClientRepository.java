package co.za.buysmart.buysmart.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

import co.za.buysmart.buysmart.model.Client;

public interface ClientRepository extends JpaRepository < Client, Long >{

}
