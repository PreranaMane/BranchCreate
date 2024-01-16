package com.cjc;

public class demo
{
  public void m1()
  {
    System.out.println("M1_Method");
  }

  public void m2()
  {
    System.out.println("M2_Method");
  }
  public static void main(String[] args) 
  {
     System.out.println("Git Branch");
    demo d = new demo();
    d.m1();
    d.m2();
  }
}
