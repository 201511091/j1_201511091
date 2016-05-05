package com.j1.w9.dim;

public class DVD {
  int speed;
  public void play() {
    this.speed = 100;
    System.out.println("DVD play");
  }
  public void stop() {
    this.speed = 0;
    System.out.println("DVD stop");
  }
  public void control(int speed) {
    this.speed = speed;
    if (speed == 0) {
      stop();
    } else {
      System.out.println("DVD is playing at " + speed + " speed");
    } 
  }
  public int getSpeed() {
    return this.speed;
  }
}