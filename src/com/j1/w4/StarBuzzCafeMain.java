package com.j1.w4;

public class StarBuzzCafeMain {
  public static void main(String[] args) {
    Beverage dr = new DarkRoast();
    Mocha m_dr = new Mocha(dr);
    Whip w_m_dr = new Whip((Beverage)m_dr);
    System.out.println(w_m_dr.getDescription());
    System.out.println(w_m_dr.cost());
    CaramelMacchiato cm = new CaramelMacchiato();
    System.out.println(cm.getDescription());
  }
}

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

class CaramelMacchiato extends Beverage {
  Beverage temp;
  public CaramelMacchiato() {
    Beverage es = new Espresso();
    Beverage es_m = new Milk(es);
    Beverage es_m_s = new Syrup(es_m);
    Beverage es_m_s_c = new CaramelSauce(es_m_s);
    temp = es_m_s_c;
    description = temp.getDescription() + " = Caramel Macchiato";
  }
  public double cost() {
    return temp.cost();
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

class Ice extends CondimentDecorator {
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

class Milk extends CondimentDecorator {
  Beverage beverage;
  public Milk(Beverage b){
    beverage = b;
  }
  public String getDescription() {
    return beverage.getDescription() + ", Milk";
  }
  public double cost() {
    return beverage.cost() + .50;
  }
}

class Syrup extends CondimentDecorator {
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

class CaramelSauce extends CondimentDecorator {
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

