package com.j1.w10;

public class HomteTheaterTestDrive {
  public static void main(String[] args) {
    Amplifier amp = new Amplifier();
    DvdPlayer dvd = new DvdPlayer(amp);
    Projector projector = new Projector(dvd);
    
    HTFcade ht = new HTFcade(amp, dvd, projector);
    ht.watchMovie("Some Movie");
    ht.endMovie();
  }
}