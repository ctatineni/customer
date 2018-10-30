package io.pivotal.demo.back;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface CustomerSource {
	
	String OUTPUT = "customerchannel-out";
	
	@Output(OUTPUT)
	MessageChannel channel();

}
