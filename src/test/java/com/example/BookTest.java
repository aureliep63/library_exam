package com.example;

import java.time.Year;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;



public class BookTest {

    @Test
    public void getAge() {
        Book book = new Book(1, "Harry Potter à l'école des sorciers", "J. K. Rowling", 1997);
        int expectedAge = Year.now().getValue() - 1997;
        int actualAge = book.age();
        assertEquals(actualAge, expectedAge, "The age method should calculate the book's age.");
    }
}
