package com.j1.w10;

import java.util.*;

public class IteratorEnumerationTestDrive {
  public static void main (String[] args) {
    String[] str = {"one", "two", "three"};
    ArrayList<String> l = new ArrayList<String>(Arrays.asList(str));
    Enumeration enumeration = new IteratorEnumeration(l.iterator());
    while (enumeration.hasMoreElements()) {
      System.out.println(enumeration.nextElement());
    }
  }
}