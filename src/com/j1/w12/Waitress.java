package com.j1.w12;

public class Waitress {
  PancakeHouseMenu phm;
  DinerMenu dm;
  public Waitress(PancakeHouseMenu p, DinerMenu d) {
    phm = p;
    dm = d;
  }
  public void printMenu() {
    Iterator phmi = phm.createIterator();
    Iterator dmi  = dm.createIterator();
    while( phmi.hasNext() ) {
      MenuItem menuItem = (MenuItem)phmi.next();
      System.out.println(menuItem.getName());
    }
    while( dmi.hasNext() ) {
      MenuItem menuItem = (MenuItem)dmi.next();
      System.out.println(menuItem.getName());
    }
  }
}