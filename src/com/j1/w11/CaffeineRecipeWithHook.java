package com.j1.w11;

import java.util.Scanner;
import java.io.*;

public abstract class CaffeineRecipeWithHook {
  public final void prepareRecipe() {
    boilWater();
    brew();
    pourInCup();
    if(customerWantsCondiments()) {
      addCondiments();
    }
  }
  public abstract void brew();
  public abstract void addCondiments();
  public void boilWater() {
    System.out.println("Boiling water");
  }
  public void pourInCup() {
    System.out.println("Pouring into cup");
  }
  public boolean customerWantsCondiments() {
    String answer = null;
    BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Do you want to add condiments? Y/N");
    try {
      answer = rd.readLine();
      if (answer.equals("Y") || answer.equals("y")) {
        return true;
      } else if (answer.equals("N") || answer.equals("n")) {
        return false;
      } else {
        System.out.println("Please type in properly");
        return customerWantsCondiments();
      }
    } catch (IOException e) {
      System.out.println("IO Error");
      return customerWantsCondiments();
    }
  }
  /*
  public boolean customerWantsCondiments() {
    Scanner a = new Scanner(System.in);
    System.out.println("Do you want to add condiment? Y/N");
    String ans = a.next();
    boolean b;
    if (ans.equals("Y")) {
      b = true;
    } else {
      b = false;
    }
    return b;
  }
  */
  
}