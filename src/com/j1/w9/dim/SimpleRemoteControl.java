package com.j1.w9.dim;

public class SimpleRemoteControl {
  private Command slot;
  
  public void setCommand(Command c){
    slot = c;
  }
  public void buttonPressed() {
    slot.execute();
    System.out.println("Button pressed");
  }
}