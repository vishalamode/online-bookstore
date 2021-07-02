package com.amodetech.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amodetech.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
