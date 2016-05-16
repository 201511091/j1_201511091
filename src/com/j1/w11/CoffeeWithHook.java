package com.j1.w11;

public class CoffeeWithHook extends CaffeineRecipeWithHook {
  public void brew() {
    System.out.println("Brewing Coffee");
  }
  public void addCondiments() {
    System.out.println("Adding Sugar and Milk");
  }
}