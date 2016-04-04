package com.j1.w4;

public class Ice extends CondimentDecorator {
  Beverage beverage;
  public Ice(Beverage b){
    beverage = b;
  }
  public String getDescription() {
    return beverage.getDescription() + ", Ice";
  }
  public double cost() {
    return beverage.cost() + .0;
  }
}
