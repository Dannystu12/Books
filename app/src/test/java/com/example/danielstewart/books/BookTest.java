package com.example.danielstewart.books;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;
    @Before
    public void setup(){
        book = new Book("Harper Lee", "To Kill A Mockingbird", 1960);
    }

    @Test
    public void canGetAuthor(){
        assertEquals("Harper Lee", book.getAuthor());
    }

    @Test
    public void canGetTitle(){
        assertEquals("To Kill A Mockingbird", book.getTitle());
    }

    @Test
    public void canGetYear(){
        assertEquals(1960, book.getYear());
    }
}
