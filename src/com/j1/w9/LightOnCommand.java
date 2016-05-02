package com.j1.w9;

public class LightOnCommand implements Command {
  private Light light;
  public LightOnCommand(Light l) {
    light = l;
  }
  public void execute() {
    light.on();
    System.out.println("Light executed");
  }
}