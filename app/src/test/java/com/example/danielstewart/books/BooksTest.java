package com.example.danielstewart.books;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BooksTest {
    Books books;

    @Before
    public void setup(){
        books = new Books();
    }

    @Test
    public void hasBooks(){
        assertEquals(10, books.getBooks().size());
    }
}
