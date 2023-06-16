package com.example.reststarters;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class ReststartersApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ReststartersApplication.class, args);
		BookRepository repository = context.getBean(BookRepository.class);

		//crear un libro
		Book book = new Book(null,"El Aleph","Jorge Luis Borges",132,50.4, LocalDate.of(1965,5,12),true);
		Book book2 = new Book(null,"Ficciones","Jorge Luis Borges",562,20.0, LocalDate.of(1952,5,12),false);

		//Almacenar libro
		repository.save(book);
		repository.save(book2);

		//recuperar libros
		System.out.println(repository.findAll());

		//borrar libro

	}

}
