package com.assignment.assignment.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.assignment.Model.Books;
import com.assignment.assignment.Repository.BooksRepository;

@Service
public class BooksService {
	@Autowired
	BooksRepository booksRepository;

	public List<Books> getAllBooks() {

		List<Books> booksDataList = new ArrayList<>();
		booksRepository.findAll().forEach(booksDataList::add);
		return booksDataList;
	}

	public Books getBooks(String id) {

		return booksRepository.findById(id).get();
	}

	public void addBooks(Books books) {

		booksRepository.save(books);
	}

	public void updateBooks(Books books, String id) {

		booksRepository.save(books);
	}

	public void delete(String id) {

		booksRepository.deleteById(id);
	}

}
