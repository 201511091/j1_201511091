package com.j1.w12;

import java.util.Arrays;
import java.util.ArrayList;

public class DuckSortTestDrive {
  public static void main(String[] args) {
    Duck[] ducks = {new Duck("Jady", 10), new Duck("Woody", 20), new Duck("Malfy", 5), new Duck("Alfy", 15), new Duck("Bumfy", 35)};
    Arrays.sort(ducks);  
    
    display(ducks);
    
    Duck[] ducks2 = {new Duck("Myung", 10), new Duck("Sang", 5), new Duck("University", 15)};
    
    DuckComparator dc = new DuckComparator();
    
    Duck temp;
    
    for (int i = 0; i < ducks2.length - 1; i++) {
      if (dc.compare(ducks2[i], ducks2[i+1]) > 0) {
        temp = ducks2[i];
        ducks2[i] = ducks2[i+1];
        ducks2[i+1] = temp;
      }
    }
    
    display(ducks2);
    
  }
  public static void display(Duck[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i].name+"\t"+arr[i].weight);
    }
  }
}