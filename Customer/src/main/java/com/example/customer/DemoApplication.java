package com.example.customer;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	//Bean som lägger till kunder varor och ordrar.
	/*@Bean
	public CommandLineRunner demo(CustomerRepository costRepo){
		return (args) -> {
			Customers c1 = new Customers("Lawrence", "8808081123");
			Customers c2 = new Customers("Indy", "3808081123");
			Customers c3 = new Customers("Lola", "3808081123");




			costRepo.save(c1);
			costRepo.save(c2);
			costRepo.save(c3);

		};
	}*/

}
