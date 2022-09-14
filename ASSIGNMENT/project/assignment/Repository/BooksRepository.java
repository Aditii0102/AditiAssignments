package com.assignment.assignment.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignment.assignment.Model.Books;

@Repository
public interface BooksRepository extends CrudRepository<Books, String> {

}
