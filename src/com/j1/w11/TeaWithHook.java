package com.j1.w11;

public class TeaWithHook extends CaffeineRecipeWithHook {
  public void brew() {
    System.out.println("Brewing Tea");
  }
  public void addCondiments() {
    System.out.println("Adding Lemon");
  }
}