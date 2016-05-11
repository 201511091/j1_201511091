package com.j1.w10;

public class Projector {
  public String description = "Wow Projector";
  public DvdPlayer dvd;
  public Projector(DvdPlayer dvd) {
    this.dvd = dvd;
  }
  public void on() {
    System.out.println("Projector On");
  }
  public void wideScreenMode() {
    System.out.println("Projector is set to wide screen mode.");
  }
  public void off() {
    System.out.println("Projector off");
  }
}