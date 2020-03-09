/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab;

/**
 *
 * @author MCALAB01017
 */
 import java.util.*;
public class Point {
   

   int x,y;
   Point()
   {
       System.out.println("Inside First Constructor");
       System.out.println("__________________________");
   }
   Point(int x, int y)
   {
       //this.x=x;
       //this.y=y;
       System.out.println("Inside the second constructor");
       System.out.println("value of x  is ="+x);
       System.out.println("value of yis ="+y);
       
   }
   void setX( int x)
   {
       //this.x=x;
       System.out.println("value of x inside the void SetX Function is is :"+x);
       
   }
   void setY(int y)
   {
       this.y=y;
       System.out.println("value of y inside the Void SetY function is :"+y);
   }
   void setXY(int x,int y)
   {
       System.out.println("after adding x & Y ="+(x+y));
       System.out.println("after multiplication "+(x*y));
   }
   public static void main(String a[])
   {
       int x,y;
       Scanner s=new Scanner(System.in);
       System.out.println("enter the value of x");
       x=s.nextInt();
       System.out.println("enter the value of y ");
       y=s.nextInt();
       Point p=new Point();
       Point p1= new Point(x,y);
       p1.setX(x);
       p1.setY(y);
       p1.setXY(x, y);
       
   }
}
    


