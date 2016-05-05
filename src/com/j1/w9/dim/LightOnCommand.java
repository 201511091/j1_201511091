package com.j1.w9.dim;

public class LightOnCommand implements Command {
  private Light light;
  public int level;
  public LightOnCommand(Light l) {
    light = l;
  }
  public void execute() {
    light.on();
    this.level = light.level;
  }
  public void undo() {
    light.dim(level);
  }
}