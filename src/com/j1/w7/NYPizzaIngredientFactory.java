package com.j1.w7;

public NYPizzaIngredientFactory implements PizzaIngredientFactory {
  public Dough createDough() {
    return new ThinCrustDough();
  }
  public Cheese createCheese() {
    return new ReggianoCheese();
  }
}