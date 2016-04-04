package com.j1.w4;

public class CaramelSauce extends CondimentDecorator {
  Beverage beverage;
  public CaramelSauce(Beverage b){
    beverage = b;
  }
  public String getDescription() {
    return beverage.getDescription() + ", Caramel Sauce";
  }
  public double cost() {
    return beverage.cost() + .40;
  }
}

