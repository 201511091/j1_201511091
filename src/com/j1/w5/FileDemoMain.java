/*
 * @author jsl
 * @since 160404
 * demo how to use decorator
 */
package com.j1.w5;

import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class FileDemoMain {
  public static void main(String[] args) throws Exception {
    File myhome;
    String cwd;
    File readme;
    InputStream isReadme = null;
    File kr;
    InputStream isKr = null;
    InputStreamReader isrKr = null;
    BufferedReader brKr = null;
    myhome = new File(System.getProperty("user.home"));
    System.out.println("my home is "+myhome);
      
    cwd = new File(".").getCanonicalPath();
    System.out.println("cwd is "+cwd);

    try {   
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

    try {
      kr = new File("korean.java");
      System.out.println("korean is "+kr);
      
      isKr = new FileInputStream(kr);
      isrKr = new InputStreamReader(isKr, "UTF8");
      brKr = new BufferedReader(isrKr);
      
      String str;
      
      while((str=brKr.readLine()) != null) {
                System.out.println("--"+str);
            }
    } catch(Exception e) {
      e.printStackTrace();
    } finally {
      if(brKr != null)
        brKr.close();
    }   
  }
}
