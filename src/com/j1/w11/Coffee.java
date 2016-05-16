package com.j1.w11;

public class Coffee {
  public void prepareRecipe() {
    boilWater();
    brewCoffeeGrinds();
    addSugarAndMilk();
    pourInCup();
  }
  public void boilWater() {
    System.out.println("Boiling Water");
  }
  public void brewCoffeeGrinds() {
    System.out.println("Brewing Grinds");
  }
  public void addSugarAndMilk() {
    System.out.println("Adding Sugar and Milk");
  }
  public void pourInCup() {
    System.out.println("Pouring in Cup");
  }
}