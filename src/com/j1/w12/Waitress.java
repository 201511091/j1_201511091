package com.j1.w12;

public class Waitress {
  PancakeHouseMenu phm;
  DinerMenu dm;
  CoffeeMenu cm;
  
  public Waitress(PancakeHouseMenu p, DinerMenu d, CoffeeMenu c) {
    phm = p;
    dm = d;
    cm = c;
  }
  public void printMenu() {
    Iterator phmi = phm.createIterator();
    Iterator dmi  = dm.createIterator();
    Iterator cmi  = cm.createIterator();
    while( phmi.hasNext() ) {
      MenuItem menuItem = (MenuItem)phmi.next();
      System.out.println(menuItem.getName());
    }
    while( dmi.hasNext() ) {
      MenuItem menuItem = (MenuItem)dmi.next();
      System.out.println(menuItem.getName());
    }
    while( cmi.hasNext() ) {
      MenuItem menuItem = (MenuItem)cmi.next();
      System.out.println(menuItem.getName());
    }
  }
}