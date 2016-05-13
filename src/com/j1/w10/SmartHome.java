package com.j1.w10;

public class SmartHome {
  public Room room;
  public Book book;
  public Note note;
  public Pen pen;
  
  public SmartHome(Room room, Book book, Note note, Pen pen) {
    this.room = room;
    this.book = book;
    this.note = note;
    this.pen = pen;
  }
  
  public void beginStudy(String subject){
    System.out.println("Studying " + subject);
    room.getIn();
    room.lightOn();
    room.sit();
    book.open();
    book.search();
    book.read();
    note.open();
    note.search();
    pen.penUp();
    pen.setPen(book.bookName);
    pen.write();
  }
  public void endStudy() {
    pen.writeStop();
    pen.penDown();
    note.close();
    book.close();
    room.getUp();
    room.lightOff();
    room.getOut();
  }
}