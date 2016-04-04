package com.j1.w4;

public class Mocha extends CondimentDecorator {
  Beverage beverage;
  public Mocha(Beverage b){
    beverage = b;
  }
  public String getDescription() {
    return beverage.getDescription() + ", Mocha";
  }
  public double cost() {
    return beverage.cost() + .20;
  }
}