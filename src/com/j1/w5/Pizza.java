package com.j1.w5;

abstract public class Pizza {
  String name;
  public void prepare() {
    System.out.println("preparing "+name);
  }
  public void bake() {
    System.out.println("backing "+name);
  }
  public void cut() {
    System.out.println("cutting "+name);
  }
  public void box() {
    System.out.println("boxing "+name);
  }
}