package com.j1.w9.dim;

public interface Command {
  public abstract void execute();
  public abstract void undo();
}