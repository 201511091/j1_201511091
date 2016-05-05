package com.j1.w9.dim;

public class CommandMain {
  public static void main(String[] args) {
    RemoteControlWithUndo remote = new RemoteControlWithUndo();
    
    Light light = new Light();
    LightOnCommand lightOn = new LightOnCommand(light);
    LightOffCommand lightOff = new LightOffCommand(light);
    remote.setCommand(0, lightOn, lightOff);
    
    GarageDoor garage = new GarageDoor();
    GarageDoorOpenCommand garageUp = new GarageDoorOpenCommand(garage);
    GarageDoorCloseCommand garageDown = new GarageDoorCloseCommand(garage);
    remote.setCommand(1, garageUp, garageDown);
    
    DVD d = new DVD();
    DVDPlayCommand dvdUp = new DVDPlayCommand(d);
    DVDStopCommand dvdDown = new DVDStopCommand(d);
    remote.setCommand(2, dvdUp, dvdDown);
    
    remote.onButtonPressed(0);
    remote.offButtonPressed(0);
    remote.undoButtonPressed();
    
    remote.onButtonPressed(1);
    remote.offButtonPressed(1);
    remote.undoButtonPressed();
    
    remote.onButtonPressed(2);
    remote.offButtonPressed(2);
    remote.undoButtonPressed();
  }
}