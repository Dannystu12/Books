package com.example.danielstewart.books;

import java.util.ArrayList;
import java.util.List;

public class Books {

    private List<Book> books;

    public Books(){
        books = new ArrayList<>();
        books.add(new Book("Harper Lee", "To Kill A Mockingbird", 1960));
        books.add(new Book("Harper Lee", "To Kill A Mockingbird", 1960));
        books.add(new Book("Harper Lee", "To Kill A Mockingbird", 1960));
        books.add(new Book("Harper Lee", "To Kill A Mockingbird", 1960));
        books.add(new Book("Harper Lee", "To Kill A Mockingbird", 1960));
        books.add(new Book("Harper Lee", "To Kill A Mockingbird", 1960));
        books.add(new Book("Harper Lee", "To Kill A Mockingbird", 1960));
        books.add(new Book("Harper Lee", "To Kill A Mockingbird", 1960));
        books.add(new Book("Harper Lee", "To Kill A Mockingbird", 1960));
        books.add(new Book("Harper Lee", "To Kill A Mockingbird", 1960));
    }

    public List<Book> getBooks(){
        return books;
    }


}
