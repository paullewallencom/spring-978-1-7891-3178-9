//video-5_3_start
package com.simonis.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.simonis.demo.entitites.Author;
import com.simonis.demo.entitites.Book;
import com.simonis.demo.repositories.AuthorRepository;
import com.simonis.demo.repositories.BookRepository;

@SpringBootApplication
public class DebuggerJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DebuggerJpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner fillDatabase(BookRepository books, AuthorRepository authors )
	{
		return (args) -> {
			Author author1= new Author("Joanne", "Rowling");
			Author author2= new Author("Stephen","King");
			Author author3= new Author("Dan","Brown");
			
			authors.save(author1);
			authors.save(author2);
			authors.save(author3);
			
			Book book1 = new Book("Harry Potter and the philosopher's stone", author1);
			Book book2 = new Book("Harry Potter and the chamber of secrets", author1);
			Book book3 = new Book("Harry Potter and the prisoner of Askaban", author1);
			
			Book book4 = new Book("Carrie", author2);
			Book book5 = new Book("It", author2);
			Book book6 = new Book("Misery", author2);
			
			Book book7 = new Book("origin", author3);
			Book book8 = new Book("Inferno", author3);
			Book book9 = new Book("The DaVinci Code", author3);
			
			books.save(book1);
			books.save(book2);
			books.save(book3);
			books.save(book4);
			books.save(book5);
			books.save(book6);
			books.save(book7);
			books.save(book8);
			books.save(book9);
			
		};
	}
	
}

//video-5_3_end