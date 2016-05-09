package com.j1.w10;

public class TurkeyTestDrive {
  public static void testTurkey(Turkey turkey) {
    turkey.gobble();
  }
  public static void main(String[] args) {
    MallradDuck duck = new MallradDuck();
    DuckAdapter da = new DuckAdapter(duck);
    // ta.quack();
    testTurkey(da);
  }
}