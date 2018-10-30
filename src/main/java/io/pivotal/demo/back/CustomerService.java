package io.pivotal.demo.back;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	
	@Autowired
	CustomerSource source;
	
	public void send(Customer c) {
		source.channel().send(MessageBuilder.withPayload(c).build());
	}
	

}
