package com.j1.w12;

public class MenuTestDrive {
  public static void main(String[] args) {
    PancakeHouseMenu pm = new PancakeHouseMenu();
    DinerMenu dm = new DinerMenu();
    CoffeeMenu cm = new CoffeeMenu();
    Waitress wt = new Waitress(pm, dm, cm);
    wt.printMenu();
  }
}