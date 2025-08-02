package com.api.book.bootrestbook.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;

import com.api.book.bootrestbook.entities.Book;
import com.api.book.bootrestbook.services.bookService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
public class bookcontroller {

    @Autowired
    private bookService bookservice;
    @GetMapping("/books")
    public List<Book> getBooks(){
        return this.bookservice.getallBooks();
    }

    @GetMapping("/books/{id}")
    public Book getBooks(@PathVariable() int id){
        return bookservice.getBookById(id);
    }

    @PostMapping("/books")
    public Book addBook(@RequestBody Book book) {
        Book b=this.bookservice.addBook(book);
        return b;
    }
    
}
