package com.example.Mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.Mvc.models.Book;
import com.example.Mvc.repositories.BookRepository;

@Service
public class BookService {
private final  BookRepository bookRepository;
public BookService(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
}
//creates a book
public List<Book> allBooks() {
    return bookRepository.findAll();
}
// creates a book
public Book createBook(Book b) {
    return bookRepository.save(b);
}

// retrieves a book
public Book findBook(Long id) {
    Optional<Book> optionalBook = bookRepository.findById(id);
    if(optionalBook.isPresent()) {
        return optionalBook.get();
    } else {
        return null;
    }
}

public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
	
	Book k = findBook(id);
	k.setTitle(title);
	k.setDescription(desc);
	k.setLanguage(lang);
	k.setNumberOfPages(numOfPages);
	bookRepository.save(k);
	return k;
	}
public void deleteBook(Long id) {
	bookRepository.deleteById(id);
	// TODO Auto-generated method stub
}

}
