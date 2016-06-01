package com.j1.w13;

public class GumballMachineTestDrive {
  public static void main(String[] args) {
    GumballMachine gumballMachine = new GumballMachine(5);

    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    gumballMachine.dispense();
    
    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    gumballMachine.dispense();
    
    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    gumballMachine.dispense();
    
    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    gumballMachine.dispense();
    
    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    gumballMachine.dispense();
    
    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    gumballMachine.dispense();
    
    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    gumballMachine.dispense();
  }
}