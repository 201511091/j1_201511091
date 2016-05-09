package com.j1.w10;

import java.util.*;

public class IteratorEnumeration implements Enumeration {
  Iterator iterator;
  public IteratorEnumeration(Iterator i) {
    iterator = i;
  }
  public boolean hasMoreElements() {
    return iterator.hasNext();
  }
  public Object nextElement() {
    return iterator.next();
  }
}