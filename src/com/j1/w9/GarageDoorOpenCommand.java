package com.j1.w9;

public class GarageDoorOpenCommand implements Command {
  private GarageDoor garageDoor;
  public GarageDoorOpenCommand(GarageDoor gr) {
    garageDoor = gr;
  }
  public void execute() {
    garageDoor.up();
    System.out.println("Garage Door executed");
  }
}