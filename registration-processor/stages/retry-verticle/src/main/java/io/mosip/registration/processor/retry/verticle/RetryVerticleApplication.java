package io.mosip.registration.processor.retry.verticle;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.mosip.registration.processor.retry.verticle.stages.RetryStage;

@SpringBootApplication
public class RetryVerticleApplication {
@Autowired
RetryStage retrySatge;
	
	public static void main(String[] args) {
		SpringApplication.run(RetryVerticleApplication.class, args);
	}
	
	@PostConstruct
	void deployVerticle() {
		retrySatge.deployVerticle();
	}
}
