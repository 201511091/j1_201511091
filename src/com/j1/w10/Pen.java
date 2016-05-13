package com.j1.w10;

public class Pen {
  public String penName;
  public String whereTo;
  
  public Pen(String penName) { this.penName = penName; }
  
  public void setPen(String whereTo) { this.whereTo = whereTo; }
  public void penUp() { System.out.println("Picked up pen " + penName); }
  public void penDown() { System.out.println("Pen down"); }
  public void write() { System.out.println("Using pen " + penName + " to write on " + whereTo); }
  public void writeStop() { System.out.println("Stopped writing"); }
}