package com.j1.w7;

public class SingletonThread {
  private static SingletonThread uniqueInstance;
  // private static Singleton uniqueInstance = new Singleton();
  private static int numCalled = 0;
  private SingletonThread() {}
  public static synchronized SingletonThread getInstance() {
    if( uniqueInstance == null) {
      uniqueInstance =new SingletonThread();
    }
    numCalled++;
    System.out.println("numCalled: "+numCalled);
    return uniqueInstance;
  }
}