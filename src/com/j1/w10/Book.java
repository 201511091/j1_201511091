package com.j1.w10;

public class Book {
  public String bookName;
  
  public Book (String bookName) { this.bookName = bookName; }
  
  public void open() { System.out.println("Opening book " + bookName); }
  public void close() { System.out.println("Closing book " + bookName); }
  public void search() { System.out.println("Searching book..."); }
  public void read() { System.out.println("Reading book..."); };
}