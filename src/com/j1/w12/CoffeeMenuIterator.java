package com.j1.w12;
  
public class CoffeeMenuIterator implements Iterator {
  
  MenuItem[] items;
  int position = 0;
  
  public CoffeeMenuIterator(MenuItem[]items) {
    this.items = items;
  }
 
  public Object next() {
    MenuItem menuItem = items[position];
    position++;
    return menuItem;
  }
  
  public boolean hasNext() {
    if ( position >= items.length || items[position] == null ) {
      return false;
    } else {
      return true;
    }
  }
  
}