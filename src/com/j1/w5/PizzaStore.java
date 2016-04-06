package com.j1.w5;

public class PizzaStore {
  SimplePizzaFactory factory;
  PizzaStore(SimplePizzaFactory factory) {
    this.factory = factory;
  }
  public Pizza orderPizza(String type) {
    Pizza pizza = null;
    pizza = factory.createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.box();
    return pizza;
  }
}