package com.j1.w10;

public class TurkeyAdapter implements Duck{
  Turkey turkey;
  public TurkeyAdapter(Turkey t) {
    turkey = t;
  }
  public void quack() {
    turkey.gobble();
  }
  public void fly() {
    System.out.println("me fly");
  }
}