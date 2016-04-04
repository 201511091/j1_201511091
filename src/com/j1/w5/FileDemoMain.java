/*
 * @author jsl
 * @since 160404
 * demo how to use decorator
 */
package com.j1.w5;

import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;

public class FileDemoMain {
  public static void main(String[] args) throws Exception {
    File myhome;
    File readme;
    InputStream isReadme = null;
    String cwd;
    try {
      myhome = new File(System.getProperty("user.home"));
      System.out.println("my home is "+myhome);
      
      cwd = new File(".").getCanonicalPath();
      System.out.println("cwd is "+cwd);
      
      readme = new File("HelloWorld.java");
      System.out.println("readme is "+readme);
      
      isReadme = new FileInputStream(readme);
      
      int i;
      
      while((i = isReadme.read()) != -1) {
        char c; 
        c = (char)i;
        System.out.print(c);
      }
    } catch(Exception e) {
      e.printStackTrace();
    } finally {
      if(isReadme != null)
        isReadme.close();
    }
  }
}
