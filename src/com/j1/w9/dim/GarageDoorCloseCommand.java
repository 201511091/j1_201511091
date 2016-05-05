package com.j1.w9.dim;

public class GarageDoorCloseCommand implements Command {
  private GarageDoor garageDoor;
  public int level;
  public GarageDoorCloseCommand(GarageDoor gr) {
    garageDoor = gr;
  }
  public void execute() {
    garageDoor.down();
    this.level = garageDoor.level;
  }
  public void undo() {
    garageDoor.height(level);
  }
}