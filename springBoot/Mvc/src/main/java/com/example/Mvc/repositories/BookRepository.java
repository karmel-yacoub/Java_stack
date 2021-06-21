package com.example.Mvc.repositories;

import java.util.List;
//import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Mvc.models.Book;



@Repository
public interface BookRepository extends CrudRepository <Book, Long>{
	List<Book> findAll();
	List<Book> findByDescriptionContaining(String search);
//	Optional<Book> findById(Long id);
}
