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

 #code changes for feature2.1 by jeevan
package com.softwaretestinghelp;
 
public class DemoClass{
public static int  sampleMethod(int a,int b) throws ArithmeticException{ 
//[1] int as data type of return value
      System.out.println("Hello, this is sample method");
      int c = a/b; // int c = 4 / 2 gets calculated as 2 
      System.out.println("c:"+c); // c: 2
      return c;//return statement 
 } 
 
public static void main (String[] args){
    int x = DemoClass.sampleMethod(4,2);//return value is assigned to variable x 
    System.out.println("x:"+x); // x: 2
 }
#end of feature2.1
}

 

}