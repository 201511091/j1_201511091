package com.j1.w6;

public class PizzaTestDrive {
  public static void main(String[] args) {
    PizzaStore nyStore = new NYPizzaStore();
    Pizza pizza = nyStore.orderPizza("cheese");
    System.out.println(pizza.getName()+"\n");
    Pizza pizza2 = nyStore.orderPizza("veggie");
    System.out.println(pizza2.getName());
  }
}