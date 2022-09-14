package com.assignment.assignment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.assignment.Model.Books;
import com.assignment.assignment.Service.BooksService;

@RestController
public class BooksController {

	@Autowired
	BooksService booksService;

	@RequestMapping("/books")
	public List<Books> getAllBooks() {
		return booksService.getAllBooks();
	}

	@RequestMapping("/books/{id}")
	public Books getBooks(@PathVariable String id) {
		return booksService.getBooks(id);

	}

	@RequestMapping(method = RequestMethod.POST, value = "/books")
	public void addBooks(@RequestBody Books books) {
		booksService.addBooks(books);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/books/{id}")
	public void updateBook(@RequestBody Books books, @PathVariable String id) {
		booksService.updateBooks(books, id);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/books/{id}")
	public void updateTopic(@PathVariable String id) {
		booksService.delete(id);
	}

}
