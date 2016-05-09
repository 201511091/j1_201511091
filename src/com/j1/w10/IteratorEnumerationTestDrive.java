package com.j1.w10;

import java.util.*;

public class IteratorEnumerationTestDrive {
  public static void main (String[] args) {
    ArrayList l = new ArrayList();
    for (int i = 0; i < 10; i++) {
      l.add(i);
    }
    Enumeration enumeration = new IteratorEnumeration(l.iterator());
    while (enumeration.hasMoreElements()) {
      System.out.println(enumeration.nextElement());
    }
  }
}