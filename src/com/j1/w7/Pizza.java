package com.j1.w7;

public abstract class Pizza {
  String name;
  Dough dough;
  Cheese cheese;
  void prepare() {
    System.out.println("Preparing... " + name);
    
  }
  void bake() {
    System.out.println("Baking...");
  }
  void cut() {
    System.out.println("Cutting...");
  }
  void box() {
    System.out.println("Boxing...");
  }
  public String getName() {
    return name;
  }
  public void setName(String s) {
    this.name = s;
  }
}