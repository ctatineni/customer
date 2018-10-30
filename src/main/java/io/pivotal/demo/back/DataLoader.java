package io.pivotal.demo.back;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner{
	
	@Autowired
	CustomerRepo repo;
	
	@Autowired
	CustomerService service;
	

	private void save(String name) {
		UUID id = UUID.randomUUID();
		UUID ano = UUID.randomUUID();
		Customer c= new Customer(id.toString(),name,ano.toString());
		repo.save(c);
		//service.send(c);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		save("john Doe");
		save("jakie chan");
		save("james bond");
		save("jason bourne");
		
	}

}
