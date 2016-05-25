package com.j1.w12;

public class MenuTestDrive {
  public static void main(String[] args) {
    PancakeHouseMenu pm = new PancakeHouseMenu();
    DinerMenu dm = new DinerMenu();
    Waitress wt = new Waitress(pm, dm);
    wt.printMenu();
  }
}