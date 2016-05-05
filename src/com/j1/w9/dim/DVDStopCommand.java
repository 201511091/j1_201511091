package com.j1.w9.dim;

public class DVDStopCommand implements Command {
  private DVD dvd;
  public int speed;
  public DVDStopCommand(DVD d) {
    dvd = d;
  }
  public void execute() {
    dvd.stop();
    this.speed = dvd.speed;
  }
  public void undo() {
    dvd.control(speed);
  }
}