package com.j1.w7;

public class CheesePizza extends Pizza {
  PizzaIngredientFactory IngredientFactory;
  public CheesePizza(PizzaIngredientFactory f) {
    this.IngredientFactory = f;
  }
  void prepare() {
    System.out.println("Preparing " + name);
    dough = IngredientFactory.createDough();
    cheese = IngredientFactory.createCheese();
  }
}