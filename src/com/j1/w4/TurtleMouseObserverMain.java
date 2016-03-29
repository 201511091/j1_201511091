package com.j1.w4;

import ch.aplu.turtle.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Point2D;

class TurtleMouseListener extends Turtle {
  public TurtleMouseListener() {
    addMouseListener(new MouseAdapter() {
      public void mousePressed(MouseEvent e) {
        Point2D.Double p;
        //p = (Point2D.DOuble)e.getPoint();
        p = toTurtlePos(e.getPoint());
        double d = distance(p);
        double w = towards(p);
        heading(w);
        forward(d);
        setStatusText("Moving to " + p.toString());
      }
      public void mouseReleased(MouseEvent e) {
        Point2D.Double p2;
        //p2 = (Point2D.DOuble)e.getPoint();
        p2 = toTurtlePos(e.getPoint());
        setStatusText("Mouse relesed at " + p2.toString());
      }	
    });
    addMouseMotionListener(new MouseMotionAdapter() {
      public void mouseDragged(MouseEvent e) {
        Point2D.Double p;
        //p = (Point2D.Double)e.getPoint();
        p = toTurtlePos(e.getPoint());
        moveTo(p);
        setStatusText("Dragging to " + p.toString());
      }
    });
  }
}

public class TurtleMouseObserverMain {
  public static void main(String[] args) {
    TurtleMouseListener t = new TurtleMouseListener();
    t.addStatusBar(20);
    t.setStatusText("Click or drag");
  }
}