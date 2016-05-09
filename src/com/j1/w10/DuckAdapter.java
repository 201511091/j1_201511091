package com.j1.w10;

public class DuckAdapter implements Turkey{
  Duck duck;
  public DuckAdapter(Duck d) {
    duck = d;
  }
  public void gobble() {
    duck.quack();
  }
  public void fly() {
    System.out.println("me fly");
  }
}