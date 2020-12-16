package co.za.buysmart.buysmart.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

import co.za.buysmart.buysmart.model.User;

public interface UserRepository extends JpaRepository < User, Long >{
	User findByEmail(String email);
}
