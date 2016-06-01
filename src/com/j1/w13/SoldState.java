package com.j1.w13;

public class SoldState implements State {
  GumballMachine gumballMachine;
  
  public SoldState (GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }
  
  public void insertQuarter() {
    System.out.println("You've already turned the crank");
  }
  
  public void ejectQuarter() {
    System.out.println("Coin ejected");
    gumballMachine.setState(gumballMachine.getNoQuarterState()); 
  }
  public void turnCrank() {
    System.out.println("Coin is already in the socket");
  }
  public void dispense() {
    gumballMachine.releaseBall();
    if (gumballMachine.count > 0) {
      System.out.println("Gumball out");
    } else {
      System.out.println("Gumball is all selled out");
      gumballMachine.setState(gumballMachine.getSoldOutState()); 
    }
    
  }
  
}