package com.j1.w4;

import ch.aplu.turtle.*;
import java.util.Observer;
import java.util.Observable;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class TurtleKeyListener extends Turtle {
  public TurtleKeyListener() {
    addKeyListener(new KeyAdapter(){
      public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch(keyCode) {
          case KeyEvent.VK_UP:
            setStatusText("forward 20");
            forward(20);
            break;
          case KeyEvent.VK_DOWN:
            setStatusText("back 20");
            back(20);
            break;
          case KeyEvent.VK_LEFT:
            setStatusText("left 20");
            left(20);
            break;
          case KeyEvent.VK_RIGHT:
            setStatusText("right 20");
            right(20);
            break;
          case KeyEvent.VK_R:
            setStatusText("position reseted");
            moveTo(0,0);
            break;
          case KeyEvent.VK_Q:
            setStatusText("q is pressed now exiting");
            break;
        }
      }
    });
  }
}

public class TurtleKeyObserverMain {
  public static void main(String[] args) {
    TurtleKeyListener t = new TurtleKeyListener();
    t.addStatusBar(20);
    t.setStatusText("Press any key!");
  }
}

