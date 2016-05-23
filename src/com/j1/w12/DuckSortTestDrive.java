package com.j1.w12;

import java.util.Arrays;
import java.util.ArrayList;

public class DuckSortTestDrive {
  public static void main(String[] args) {
    Duck[] ducks = {new Duck("Jady", 10), new Duck("Woody", 20), new Duck("Malfy", 5), new Duck("Alfy", 15), new Duck("Bumfy", 35)};
    Arrays.sort(ducks);  
    for (int i = 0; i < ducks.length; i++) {
      System.out.println(ducks[i].name+"\t"+ducks[i].weight);
    }
    
  }
}