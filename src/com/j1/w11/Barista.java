package com.j1.w11;

public class Barista {
  public static void main(String[] args) {
    Tea tea = new Tea();
    Coffee coffee = new Coffee();
    
    Tea2 tea2 = new Tea2();
    Coffee coffee2 = new Coffee();
    
    TeaWithHook hookTea = new TeaWithHook();
    CoffeeWithHook hookCoffee = new CoffeeWithHook();
    
    tea.prepareRecipe();
    coffee.prepareRecipe();
    
    System.out.println("--------------------------");
    
    tea2.prepareRecipe();
    coffee2.prepareRecipe();
    
    System.out.println("--------------------------");
    
    hookTea.prepareRecipe();
    hookCoffee.prepareRecipe();
  }
}