package com.example.bookapp.config;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.bookapp.entity.Book;
import com.example.bookapp.service.BookService;

@Configuration
public class DatabaseInitializer {

	@Bean
	CommandLineRunner init(BookService bs) {
		CommandLineRunner clr = s->bs.createAllBooks(getBooks());	
		return clr;
	}
	
	List<Book> getBooks(){
	var list = List.of(
			new Book(null,"ネコポストに投函", LocalDate.of(2025, 5, 6),800,"ネコポストってなんですか？"),
			new Book(null, "AIと未来社会", LocalDate.of(2025, 4, 15), 1200, "AIが私たちの暮らしをどう変えるのかを解説しています。"),
		    new Book(null, "リファクタリング入門", LocalDate.of(2024, 12, 1), 1800, "読みやすいコードに生まれ変わらせる技術が満載。"),
		    new Book(null, "Java実践ガイド", LocalDate.of(2025, 1, 10), 2300, "初心者から中級者までのJava学習を支える完全ガイド。"),
		    new Book(null, "猫のいる日常", LocalDate.of(2023, 8, 22), 900, "猫との暮らしを通じて感じる癒しと発見の日々。")
			);
	return list;
	}
}
