package com.j1.w9.dim;

public class DVDPlayCommand implements Command {
  private DVD dvd;
  public int speed;
  public DVDPlayCommand(DVD d) {
    dvd = d;
  }
  public void execute() {
    dvd.play();
    this.speed = dvd.speed;
  }
  public void undo() {
    dvd.control(speed);
  }
}