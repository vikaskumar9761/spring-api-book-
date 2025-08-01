package com.api.book.bootrestbook.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.api.book.bootrestbook.entities.Book;

@Component
public class bookService {
    
    private static List<Book> list=new ArrayList<Book>();

    static{
        list.add(new Book(1,"java","vikas"));
        list.add(new Book(2,"python","vikas"));
        list.add(new Book(3,"c++","vikas"));


    }


    //get all books
    public List<Book> getallBooks(){
        return list;
    }

    //get single book
    // public Book getABook(int id){
    //     for(Book book:list){
    //         if(book.getId()==id){
    //             return book;
    //         }
    //     }
    //     return null;
    // }

    public Book getBookById(int id){
        Book book=null;
        book=list.stream().filter(e ->e.getId()==id).findFirst().get( );
        return book;
    }
}
