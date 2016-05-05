package com.j1.w9.dim;

public class LightOffCommand implements Command {
  private Light light;
  public int level;
  public LightOffCommand(Light l) {
    light = l;
  }
  public void execute() {
    light.off();
    this.level = light.level;
  }
  public void undo() {
    light.dim(level);
  }
}