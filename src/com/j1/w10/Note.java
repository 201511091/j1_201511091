package com.j1.w10;

public class Note {
  public String noteName;
  
  public Note(String noteName) { this.noteName = noteName; };
  
  public void open() { System.out.println("Opening note " + noteName); }
  public void close() { System.out.println("Closing note " + noteName); }
  public void search() { System.out.println("Searching note..."); }
}