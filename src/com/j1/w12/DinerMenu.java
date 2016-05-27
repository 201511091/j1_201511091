package com.j1.w12;

public class DinerMenu implements Menu{
  static final int MAX_ITEMS = 6;
  int numberOfItems = 0;
  MenuItem[] menuItems;
  
  public static String toLatin(String str){ 
     try{ 
            byte[] b = str.getBytes(); 
            return new String(b, "EUC-KR"); 
 } catch (java.io.UnsupportedEncodingException uee) { 
          System.out.println(uee.getMessage());
          return null; 
   } 
 } 
 
  
  public DinerMenu() {
    menuItems = new MenuItem[MAX_ITEMS];
    addItem("BLT", "wowwowowowowowowow", false, 2.9);
    addItem("apple", "asdsda", true, 0.9);
    addItem("grape", "gragragargar", true, 1.9);
    
    addItem(toLatin("베지테리안 음식 1"), "...", true, 3.9);
    addItem(toLatin("베지테리안 음식 2"), "...", true, 1.9);
    addItem(toLatin("베지테리안 음식 3"), "...", true, 4.9);
  }
  
  public Iterator createIterator() {
    Iterator dmi = new DinerMenuIterator(menuItems);
    return dmi;
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