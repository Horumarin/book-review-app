package com.example.bookapp.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.bookapp.entity.Book;
import com.example.bookapp.form.BookForm;
import com.example.bookapp.repository.BookRepository;

@Service
public class BookService {
	
	private BookRepository repo;

	public BookService(BookRepository repo) {
		this.repo = repo;
	}
	
	public List<Book> readAllBooks(){
		return repo.findAll();
	}
	
	public Book readBookById(Long id) {
		return repo.findById(id).orElseThrow();
	}
	
	@Transactional
	public void createAllBooks(List<Book> books) {
		repo.saveAll(books);
	}
	
	@Transactional
	public Book createBook(BookForm bookForm) {
		Book book = new Book();
		toEntity(book, bookForm);
		repo.save(book);
		return book;
	}
	
	@Transactional
	public Book updateBook(BookForm bookForm) {
		Book book = readBookById(bookForm.getId());
		toEntity(book, bookForm);
		repo.save(book);
		return book;
	}
	@Transactional
	public void deleteBook(Long id) {
		repo.deleteById(id);
	}

	private void toEntity(Book book, BookForm bookForm) {
		book.setTitle(bookForm.getTitle());
		book.setDate(bookForm.getDate());
		book.setPrice(bookForm.getPrice());
		book.setContents(bookForm.getContents());
		
	}
	
	public BookForm toForm(Book book) {
		return new BookForm(book.getId(),
				book.getTitle(),
				book.getDate(),
				book.getPrice(),book.getContents());
	}
}
