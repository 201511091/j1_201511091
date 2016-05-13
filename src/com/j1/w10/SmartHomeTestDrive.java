package com.j1.w10;

public class SmartHomeTestDrive {
  public static void main(String[] args) {
    Room room = new Room("MyRoom", "MySeat");
    Book book = new Book("MyBook");
    Note note = new Note("MyNote");
    Pen pen = new Pen("MyPen");
    
    SmartHome smartHome = new SmartHome(room, book, note, pen);
    smartHome.beginStudy("MySubject");
    smartHome.endStudy();
  }
}