package fr.ippon.bbianic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class BbIanicApplication {

	public static void main(String[] args) {
		SpringApplication.run(BbIanicApplication.class, args);
	}


	@RestController
	private static class Controller {

		@GetMapping("/hello")
		public String getHello() {
			return "Hello 0.92";
		}
	}
}
