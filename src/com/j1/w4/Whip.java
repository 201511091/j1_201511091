package com.j1.w4;

public class Whip extends CondimentDecorator {
  Beverage beverage;
  public Whip(Beverage b){
    beverage = b;
  }
  public String getDescription() {
    return beverage.getDescription() + ", Whip";
  }
  public double cost() {
    return beverage.cost() + .10;
  }
}