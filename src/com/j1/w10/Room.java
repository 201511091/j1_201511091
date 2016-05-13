package com.j1.w10;

import com.j1.w9.Light;

public class Room {
  public String roomName;
  public String seatName;
  
  public Light light = new Light();
  public Room(String roomName, String seatName) { this.roomName = roomName; this.seatName = seatName; }
  
  public void getIn() { System.out.println("Entered room " + roomName); }
  public void getOut() { System.out.println("Got out of the room " + roomName); }
  public void lightOn() { this.light.on(); }
  public void lightOff() { this.light.off(); }
  public void sit() { System.out.println("Set on " + seatName); }
  public void getUp() { System.out.println("Got up from the seat " + seatName); }
}