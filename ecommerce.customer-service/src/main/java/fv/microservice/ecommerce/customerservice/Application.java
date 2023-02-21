package fv.microservice.ecommerce.customerservice;

import fv.microservice.ecommerce.customerservice.dto.CustomerRequest;
import fv.microservice.ecommerce.customerservice.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.apache.hc.core5.reactor.Command;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.util.Random;
import java.util.stream.Stream;

@SpringBootApplication
@EnableDiscoveryClient
@RequiredArgsConstructor
public class Application {

	private final CustomerService customerService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(){
		return args -> {
			Stream.of("root", "home", "chall")
					.forEach(name->{
						customerService.create(
							CustomerRequest.builder()
								.name(name)
								.age(new Random().nextInt(60))
								.email(name+"@yahoo.net")
								.build()
						);
					});
		};
	}

}
