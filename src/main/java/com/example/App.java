package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Book book1 = new Book(1, "Harry  Potter à l'école des sorciers", "J.K. Rowling", 1997);
        Book book2 = new Book(2, "Game of Thrones - le trône de fer : les origines de la saga", "George R. R. Martin", 2014);

        System.out.println("Le livre " + book1.getTitle() + " a " + book1.age() + " ans.");
        System.out.println("Le livre" + book2.getTitle() + " a " + book2.age() + " ans.");

    }
}
