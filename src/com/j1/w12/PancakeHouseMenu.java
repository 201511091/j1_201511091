package com.j1.w12;

import java.util.ArrayList;

public class PancakeHouseMenu {
  ArrayList<MenuItem> menuItems;
  public PancakeHouseMenu() {
    menuItems = new ArrayList();
    addItem("c1", "kek", false, 1.9);
    addItem("c2", "lol", true, 5.9);
    addItem("c3", "fik", false, 2.9);
  }
  public void addItem(String n, String d, boolean v, double p) {
    MenuItem menuItem = new MenuItem(n, d, v, p);
    menuItems.add(menuItem);
  }
}