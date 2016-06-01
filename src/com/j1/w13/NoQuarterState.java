package com.j1.w13;

public class NoQuarterState implements State {
  GumballMachine gumballMachine;
  
  public NoQuarterState (GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }
  
  public void insertQuarter() {
    System.out.println("You inserted a quarter");
    gumballMachine.setState(gumballMachine.getHasQuarterState()); 
  }
  public void ejectQuarter() {
    System.out.println("There is no quarter to return");
  }
  public void turnCrank() {
    System.out.println("You need to insert coin");
  }
  public void dispense() {
    System.out.println("Insert coin first");
  }
  
}