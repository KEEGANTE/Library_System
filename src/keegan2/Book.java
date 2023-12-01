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
public class Book {
    private int bookISBN;
    private Title title;
    private Type type;
     private ArrayList<Author> authors;
    private double fine;
    private String duration;
    private boolean audiobook;
    private LocalDate borroweddate;
    private LocalDate duedate;
    private boolean borrowed;
    
    
    
    
        //Duration duration = Duration.between(startInstant, endInstant); // Calculate duration between two instants
       // long seconds = duration.getSeconds(); // Get duration in seconds
    
    
    
    public Book() {
        this.authors = new ArrayList<>(); // Initialize the list of authors
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }
    
     public ArrayList<Author> getAuthors() {
        return authors;
    }
    /**
     * @return the bookISBN
     */
    public int getBookISBN() {
        return bookISBN;
    }


    public void setBookISBN(int bookISBN) {
        this.bookISBN = bookISBN;
    }

    /**
     * @return the title
     */
    public Title getTitle() {
        return title;
    }

   
    public void setTitle(Title title) {
        this.title = title;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    
    /*public Author getAuthor() {
        return author;
    }

    
    public void setAuthor(Author author) {
        this.author = author;
    }*/


 
    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }


    /**
     * @return the audiobook
     */
    public boolean isAudiobook() {
        return audiobook;
    }

    /**
     * @param audiobook the audiobook to set
     */
    public void setAudiobook(boolean audiobook) {
        this.audiobook = audiobook;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * @return the duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * @return the borroweddate
     */
    public LocalDate getBorroweddate() {
        return borroweddate;
    }

    /**
     * @param borroweddate the borroweddate to set
     */
    public void setBorroweddate(LocalDate borroweddate) {
        this.borroweddate = borroweddate;
    }

    /**
     * @return the duedate
     */
    public LocalDate getDuedate() {
        return duedate;
    }

    /**
     * @param duedate the duedate to set
     */
    public void setDuedate(LocalDate duedate) {
        this.duedate = duedate;
    }

    /**
     * @return the borrowed
     */
    public boolean isBorrowed() {
        return borrowed;
    }

    /**
     * @param borrowed the borrowed to set
     */
    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }
}


