package com.j1.w10;

public class HTFcade {
  private Amplifier amp;
  private DvdPlayer dvd;
  private Projector projector;
  
  public HTFcade(Amplifier amp, DvdPlayer dvd, Projector projector) {
    this.amp = amp;
    this.dvd = dvd;
    this.projector = projector;
  }
  public void watchMovie(String movie) {
    System.out.println("Get ready to watch a movie...");
    projector.on();
    projector.wideScreenMode();
    amp.on();
    amp.setDvd(dvd);
    amp.setVolume(5);
    dvd.on();
    dvd.play(movie);
  }
  public void endMovie() {
    System.out.println("Shutting off...");
    projector.off();
    amp.off();
    dvd.stop();
    dvd.eject();
    dvd.off();
  }
}