package com.example.bookapp.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.example.bookapp.entity.Book;

public interface BookRepository extends JpaRepositoryImplementation<Book, Long> {

}
