package com.j1.w11;

public class Tea {
  public void prepareRecipe() {
    boilWater();
    steepTeaBag();
    addLemon();
    pourInCup();
  }
  public void boilWater() {
    System.out.println("Boiling Water");
  }
  public void steepTeaBag() {
    System.out.println("Steeping Tea Bag");
  }
  public void addLemon() {
    System.out.println("Adding Lemon");
  }
  public void pourInCup() {
    System.out.println("Pouring in Cup");
  }
}