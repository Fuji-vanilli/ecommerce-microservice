package fv.microservice.ecommerce.inventoryservice;

import fv.microservice.ecommerce.inventoryservice.dto.ProductRequest;
import fv.microservice.ecommerce.inventoryservice.service.ProductService;
import lombok.RequiredArgsConstructor;
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

	private final ProductService productService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(){
		return args -> {
			Stream.of("HP Deskjet", "Ordi portable Asus X500", "souris sans fil", "Clavier")
					.forEach(name->{
						productService.create(
							ProductRequest.builder()
									.designation(name)
									.price(new Random().nextDouble()*1000)
									.quantity(new Random().nextInt(50))
									.build()
						);
					});
		};
	}

}
