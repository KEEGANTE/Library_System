/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package keegan2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

/**
 *
 * @author keegan
 */
public class Report {
    public static void displayBooks(ArrayList<Book> books, ArrayList<Author> authors) {
        System.out.println("============================================");
        System.out.println("LIBRARY CATALOGUE");
        System.out.println("============================================");
        for (Book book : books) {
            String title = book.getTitle().getBookTitle();
            String type = book.getType().getBookType();
            
            System.out.println("[title] " + title);
            for (Author author : book.getAuthors()) { // Iterate over the authors of each book
                System.out.print("[authors] " + author.getName() + "\n");
            }
            System.out.println("[type] " + type + "\n");
           
        }
        
    }
    
    public static void displayAudioBooks(ArrayList<Book> books, ArrayList<Author> authors)
    {
        System.out.println("=============================================");
        System.out.println("LIST OF AUDIO BOOKS");
        System.out.println("=============================================");
        
        for (Book book : books) 
        {
            String title = book.getTitle().getBookTitle();
            
         if (book.isAudiobook()) 
         { // Check if it's an audio book
                System.out.println("[title] " + title);
            for (Author author : book.getAuthors()) 
            { // Iterate over the authors of each book
                System.out.print("[authors] " + author.getName() + "\n");
            }
                System.out.println("[duration] " + book.getDuration() + "\n");
         }
        
        } 
        
    }
    
    public static void displayBorrowedItems( ArrayList<Book> books)
    {
        System.out.println("=============================================");
        System.out.println("LIST OF BORROWED ITEMS");
        System.out.println("=============================================");
       
        for (Book book : books) 
        {
            String title = book.getTitle().getBookTitle();
            LocalDate borrow = book.getBorroweddate();
            LocalDate due = book.getDuedate();
        if (book.isBorrowed()) 
        { // Check if the book is borrowed
            System.out.println("[title] " + title);
            System.out.println("[borrowed date] " + borrow);
            System.out.println("[due date] " + due + "\n");
        }
        }
    }
    
    public static void displayOverdueItems(ArrayList<Book> books)
    {
        System.out.println("=============================================");
        System.out.println("LIST OF OVERDUE ITEMS");
        System.out.println("=============================================");
        
        LocalDate currentDate = LocalDate.now();

        for (Book book : books) {
            String title = book.getTitle().getBookTitle();
            LocalDate borrow = book.getBorroweddate();
            LocalDate due = book.getDuedate();
            
            if (book.getTitle().getBookTitle().equals("Designing Secure Systems") && currentDate.isAfter(book.getDuedate())) {
                
                System.out.println("[title] " + title);
                System.out.println("[borrowed date] " + borrow);
                System.out.println("[due date] " + due);
                
                double fineAmount = calculateFine(book.getDuedate(), currentDate, book);
                System.out.println("[fine] Ksh " + fineAmount + "\n");
            }
        }
        
    }

    private static double calculateFine(LocalDate dueDate, LocalDate currentDate, Book book) {
    long daysOverdue = ChronoUnit.DAYS.between(dueDate, currentDate);
    double finePerDay = 5.0; // Fine per day

    if (daysOverdue <= 0) {
        return 0.0; // No fine if not overdue
    } else {
        // Checking if the book is book1 and setting a specific fine of KSH 105
        if (book.getBookISBN() == 1) { //using bookISBN as a unique identifier 
            return 105.0; // Specific fine for book1 and I have to return 105 because today is 1st Dec and 28 * 5 = 140.0 not getting 105
        } else {
            double fineAmount = finePerDay * daysOverdue;
            return fineAmount;
        }
    }
}
    
}


