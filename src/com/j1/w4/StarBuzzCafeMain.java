package com.j1.w4;

abstract class Beverage {
  String description = "Unkown beverage";
  public String getDescription() {
    return description;
  }
  public abstract double cost();
}

class Espresso extends Beverage {
  public Espresso() {
    description = "Espresso";
  }
  public double cost() {
    return 1.99;
  }
}

class DarkRoast extends Beverage {
  public DarkRoast() {
    description = "Dark Roast Coffee";
  }
  public double cost() {
    return .99;
  }
} 

abstract class CondimentDecorator extends Beverage {
  public abstract String getDescription();
}

class Mocha extends CondimentDecorator {
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

class Whip extends CondimentDecorator {
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

public class StarBuzzCafeMain {
  public static void main(String[] args) {
    Beverage dr = new DarkRoast();
    Mocha m_dr = new Mocha(dr);
    Whip w_m_dr = new Whip((Beverage)m_dr);
    System.out.println(w_m_dr.getDescription());
    System.out.println(w_m_dr.cost());
  }
}