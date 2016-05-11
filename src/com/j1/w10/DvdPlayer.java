package com.j1.w10;

public class DvdPlayer {
  public String description = "Wow Player";
  public Amplifier amp;
  public String movie;
  
  public DvdPlayer(Amplifier amp) {
    this.amp = amp;
  }
  public void on() {
    System.out.println("DvdPlayer is on.");
  }
  public void play(String movie) {
    this.movie = movie;
    System.out.println(movie + " is playing");
  }
  public void stop() {
    System.out.println("Dvd player stopped");
  }
  public void off() {
    System.out.println("Dvd player off");
  }
  public void eject() {
    System.out.println("Dvd eject");
  }
}