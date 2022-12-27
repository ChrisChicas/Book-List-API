package com.personal.booklist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class BookListApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookListApplication.class, args);
	}

@RestController
public class home{
	@GetMapping("/")
	public String homeController(){
		return "Home!";
	}
}

}
