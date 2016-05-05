package com.j1.w9.dim;

public class GarageDoor {
  int level;
  public void up() {
    this.level = 100;
    System.out.println("Door opened");
  }
  public void down() {
    this.level = 0;
    System.out.println("Door closed");
  }
  public void height(int level) {
    this.level = level;
    if (level == 0) {
      down();
    } else {
      System.out.println("Door is opened to " + level);
    } 
  }
  public int getHeight() {
    return this.level;
  }
}