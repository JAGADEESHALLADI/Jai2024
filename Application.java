package com.softwaretestinghelp;
 
public class DemoClass{
 
  public static void sampleMethod(int a,int b) throws ArithmeticException{
      System.out.println("Hello, this is sample method");
      int c = a/b;
      System.out.println("c:"+c);
 }
  
 public static void main (String[] args){
    DemoClass.sampleMethod(4,2);     
 }
 
}