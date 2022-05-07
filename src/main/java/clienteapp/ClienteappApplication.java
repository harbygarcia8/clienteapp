package clienteapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"clienteappController"})
public class ClienteappApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClienteappApplication.class, args);
	}

}
