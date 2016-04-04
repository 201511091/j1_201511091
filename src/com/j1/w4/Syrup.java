package com.j1.w4;

public class Syrup extends CondimentDecorator {
  Beverage beverage;
  public Syrup(Beverage b){
    beverage = b;
  }
  public String getDescription() {
    return beverage.getDescription() + ", Syrup";
  }
  public double cost() {
    return beverage.cost() + .20;
  }
}