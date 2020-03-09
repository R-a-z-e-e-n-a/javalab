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
public class ref 
   
{
    int x,y;
    void read()
    {
        Scanner S=new Scanner(System.in);
        System.out.println("enter 2 number");
        this.x=x;
        this.y=y;
        x=S.nextInt();
        y=S.nextInt();
    }
    void add(Ref R,Ref R1)
    {
      x=R.x+R1.x;
      y=R.y+R1.y;
   
      System.out.println("value of x="+x+"Value of y="+y);
     
    }
    public static void main(String args[])
    {
      //  int x,y;
        Ref R=new Ref();
        R.read();
        Ref R1 = new Ref();
        R1.read();
        Ref R2=new Ref();
        R2.add(R,R1);
        //int z= R1.add(R);
      //  System.out.println("value of y ="+z);
    }
}
    

