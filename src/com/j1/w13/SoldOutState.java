package com.j1.w13;

public class SoldOutState implements State {
  GumballMachine gumballMachine;
  
  public SoldOutState (GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }
  
  public void insertQuarter() {
    System.out.println("Machine is empty try later");
  }
  public void ejectQuarter() {
    System.out.println("No coin to ejact");
  }
  public void turnCrank() {
    System.out.println("No Coin is in the socket");
  }
  public void dispense() {
    System.out.println("No gumball is dispensed");
  }
  
}