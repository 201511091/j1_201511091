package com.j1.w12;

public class CoffeeMenu implements Menu{
  static final int MAX_ITEMS = 3;
  int numberOfItems = 0;
  MenuItem[] menuItems;
  
  public CoffeeMenu() {
    menuItems = new MenuItem[MAX_ITEMS];
    addItem("coffee1", "3w", true, 1.9);
    addItem("coffee2", "a2", true, 4.9);
    addItem("coffee3", "gr2r", true, 8.9);
  }
  
  public Iterator createIterator() {
    Iterator cmi = new CoffeeMenuIterator(menuItems);
    return cmi;
  }
  
  public void addItem(String n, String d, boolean v, double p) {
    MenuItem menuItem = new MenuItem(n, d, v, p);
    if (numberOfItems >= MAX_ITEMS) {
      System.out.println("Error");
    } else {
      menuItems[numberOfItems] = menuItem;
      numberOfItems += 1;
    }
  }
}