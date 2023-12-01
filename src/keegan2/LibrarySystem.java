/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package keegan2;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author keegan
 */

public class LibrarySystem {
    public static void main (String [] args)
    {
        Title title1 = new Title();
        title1.setBookTitle("Designing Secure Systems");
        
        Title title2 = new Title();
        title2.setBookTitle("Web Design Unleashed");
        
        Title title3 = new Title();
        title3.setBookTitle("Understanding TCP/IP Networks");
        
        Title title4 = new Title();
        title4.setBookTitle("Quiting a Habit in 21 Days");
        
        Author author1 = new Author();
        author1.setName("Bob Smith");
        
        Author author2 = new Author();
        author2.setName("Jake Sims");
        
        Author author3 = new Author();
        author3.setName("Brian John");
        
        Author author4 = new Author();
        author4.setName("Laura Daniels");
        
        Author author5 = new Author();
        author5.setName("Rose Cole");
        
        Type type1 = new Type();
        type1.setBookType("Book");
        
        Type type2 = new Type();
        type2.setBookType("Book");
        
        Type type3 = new Type();
        type3.setBookType("Book");
        
        Type type4 = new Type();
        type4.setBookType("Audio Book");
        
        Book book1 = new Book();
        book1.setTitle(title1);
        book1.addAuthor(author1);
        book1.setType(type1);
        book1.setBorrowed(true);
        book1.setBorroweddate(LocalDate.of(2023, 10, 20));
        book1.setDuedate(LocalDate.of(2023, 11, 3));
        book1.setBookISBN(1);
        
        Book book2 = new Book();
        book2.setTitle(title2);
        book2.addAuthor(author2 );
        book2.addAuthor(author3);
        book2.setType(type2);
        book2.setBookISBN(2);
        book2.setBorrowed(true);
        book2.setBorroweddate(LocalDate.of(2023, 10, 20));
        book2.setDuedate(LocalDate.of(2023, 11, 3));
        
        Book book3 = new Book();
        book3.setTitle(title3);
        book3.addAuthor(author4);
        book3.setType(type3);
        book3.setBookISBN(3);
        
        Book book4 = new Book();
        book4.setTitle(title4);
        book4.addAuthor(author5);
        book4.setType(type4);
        book4.setBookISBN(4);
        book4.setAudiobook(true);
        book4.setDuration("90 minutes");
        
        
        ArrayList <Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        
        ArrayList <Author> authors = new ArrayList();
        authors.add(author3);
        
        
        Report.displayBooks(books, authors);
        Report.displayAudioBooks(books, authors);
        Report.displayBorrowedItems(books);
        Report.displayOverdueItems(books);
    }
    
}



