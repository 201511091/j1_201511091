package com.j1.w13;

public class GumballMachine {
  State soldOutState;
  State noQuarterState;
  State hasQuarterState;
  State soldState;
  
  State state = soldOutState;
  
  int count = 0;
  
  public GumballMachine(int count) {
    soldOutState = new SoldOutState(this);
    noQuarterState = new NoQuarterState(this);
    hasQuarterState = new HasQuarterState(this);
    soldState = new SoldState(this);
    
    this.count = count;

    if (count > 0) {
      state = noQuarterState;
    }
  }
  
  public void refill(int n) {
    this.count = n;
    this.setState(this.getNoQuarterState()); 
  }
  
  public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
  }
  public void insertQuarter() {
    state.insertQuarter();
  }  
  
  public void ejectQuarter() {
    state.ejectQuarter();
  }
  public void turnCrank() {
    state.turnCrank();
  }
  public void dispense() {
    state.dispense();
  }
  public void setState(State state) {
    this.state = state;
  }
    
  public State getNoQuarterState() {
    return noQuarterState;
  }
  
  public State getHasQuarterState() {
    return hasQuarterState;
  }
  public State getSoldOutState() {
    return soldOutState;
  }
  public State getSoldState() {
    return soldState;
  }
}