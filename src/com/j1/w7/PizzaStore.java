package com.j1.w7;

public abstract class PizzaStore {
  abstract Pizza createPizza(String type);  
  public Pizza orderPizza(String type) {
    Pizza pizza = createPizza(type);
    System.out.println("Making " + pizza.getName());
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    return pizza;
  }
}