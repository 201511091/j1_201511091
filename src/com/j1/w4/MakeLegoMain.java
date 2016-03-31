package com.j1.w4;

public class MakeLegoMain {
  public static void main(String[] args) {
    Lego eb = new EmptyBoard(5,5);
    Onebytwo b1 = new Onebytwo(5,4,eb);
    eb.display();
    eb.getPos();
    b1.display();
    b1.getPos();
    eb.setPos(3,3);
    eb.display();
    b1.setPos(7,5);
    b1.display();
    b1.getPos();
  }
}

abstract class Lego {
  public int x;
  public int y;
  public String name;
  public int[][] obj;
  public int[][] canvas = new int[16][16];
  
  public abstract void getPos();
  public abstract void setPos(int x, int y);
  public abstract void display();
}

class EmptyBoard extends Lego {
  EmptyBoard(int x, int y) {
    this.x = x;
    this.y = y;
    this.name = "Empty Board";
    this.obj = new int[][]{
      {1,1,1,1,1,1,1,1},
      {1,1,1,1,1,1,1,1},
      {1,1,1,1,1,1,1,1},
      {1,1,1,1,1,1,1,1},
      {1,1,1,1,1,1,1,1},
      {1,1,1,1,1,1,1,1},
      {1,1,1,1,1,1,1,1},
      {1,1,1,1,1,1,1,1},
    };
  }
  public void getPos() {
    System.out.println("Current position of the "+name+" is "+"at ("+x+", "+y+")");
    System.out.println("\n--------------------------------------------------------------------\n");
  }
  public void setPos(int x, int y) {
    this.canvas = new int[16][16];
    for (int i = 0; i < obj.length; i++) {
      for (int j = 0; j < obj[i].length; j++) 
        this.canvas[y + i - 1][x + j - 1] += obj[i][j];
    }
  }
  public void display() {
    for(int i = 0; i < canvas.length; i++) {
      for(int j = 0; j < canvas[i].length; j++) {
        System.out.print(canvas[i][j]+"  ");
      }
      System.out.println();
    }
    System.out.println("\n--------------------------------------------------------------------\n");
  }
}

abstract class BlockDecorator extends Lego {
  Lego lego;
  int tempX; 
  int tempY;
  
  public void getPos() {
    System.out.println("Current position of the "+name+" is "+"at ("+(lego.x + x)+", "+(lego.y + y)+")");
    System.out.println("\n--------------------------------------------------------------------\n");
  }
  
  public void setPos(int x, int y) {
    if (this.tempX != 0 && this.tempY != 0){
      for (int i = 0; i < obj.length; i++) {
        for (int j = 0; j < obj[i].length; j++) 
          lego.obj[this.tempY + i - 1][this.tempX + j - 1] -= obj[i][j];
      }
    }
    for (int i = 0; i < obj.length; i++) {
      for (int j = 0; j < obj[i].length; j++) 
        lego.obj[y + i - 1][x + j - 1] += obj[i][j];
    }
    lego.setPos(lego.x, lego.y);
    this.tempX = x; 
    this.tempY = y;
    this.x = x;
    this.y = y;
  }
  
  public void display() {
    for(int i = 0; i < lego.obj.length; i++) {
      for(int j = 0; j < lego.obj[i].length; j++) {
        System.out.print(lego.obj[i][j]+"  ");
      }
      System.out.println();
    }
    System.out.println("\n--------------------------------------------------------------------\n");
  }
}

class Onebytwo extends BlockDecorator{
  Onebytwo(int x, int y, Lego l) {
    this.x = x;
    this.y = y;
    this.name = "Conered Block";
    this.obj = new int[][] {
      {1,1},
      {0,1}
    };
    this.lego = l;
    super.setPos(x, y);
  }
}
