package com.j1.w10;

public class Amplifier {
  public String description = "Cool Amp";
  public DvdPlayer dvd;
  
  public void on() {
    System.out.println("Amp On");
  }
  public void setDvd(DvdPlayer dvd) {
    this.dvd = dvd;
    System.out.println("DVD set to " + this.dvd.description);
  }
  public void setVolume(int vol) {
    System.out.println("Volume is set to " + vol);
  }
  public void off() {
    System.out.println("Amplifier off");
  }
}