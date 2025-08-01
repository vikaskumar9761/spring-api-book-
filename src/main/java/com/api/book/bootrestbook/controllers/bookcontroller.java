package com.api.book.bootrestbook.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.book.bootrestbook.entities.Book;
import com.api.book.bootrestbook.services.bookService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



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
}
