package com.j1.w7;

public class SingletonMain {
  public static void main(String[] args) {
    Singleton s1 = Singleton.getInstance();
    Singleton s2 = Singleton.getInstance();
    Singleton s3 = Singleton.getInstance();
    SingletonThread s4 = SingletonThread.getInstance();
    SingletonThread s5 = SingletonThread.getInstance();
    SingletonThread s6 = SingletonThread.getInstance();
  }
}