package com.j1.w9.dim;

public class GarageDoorOpenCommand implements Command {
  private GarageDoor garageDoor;
  public int level;
  public GarageDoorOpenCommand(GarageDoor gr) {
    garageDoor = gr;
  }
  public void execute() {
    garageDoor.up();
    this.level = garageDoor.level;
  }
  public void undo() {
    garageDoor.height(level);
  }
}