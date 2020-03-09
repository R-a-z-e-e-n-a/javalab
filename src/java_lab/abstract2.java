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
public class abstract2 {
    
   abstract void read();
   abstract void volume();
}
class Cy extends Abstract2
{
   float r;
   float h;
   void read()
   {
       Scanner sc=new Scanner(System.in);
               r=sc.nextFloat();
               h=sc.nextFloat();
               
   }
   void volume()
   {
       double volume;
       volume=3.141*r*r*h;
       System.out.println("volume cylinder:" +volume);
   }
   
   }
class Cu extends abtract2
{
   int a;
   void read()
   {
       Scanner sc=new Scanner (System.in);
       System.out.println("enter the side of cube");
       a=sc.nextInt();
   }
   void volume()
   {
       int v;
       v=a*a;
       System.out.println("volume of cube="+v);
   }
   public static void main(String args[])
   {
       abtract2 s=new Cy();
       s.read();
       s.volume();
      abstract2 s1=new Cu();
       s1.read();
       s1.volume();
   }
}
    

