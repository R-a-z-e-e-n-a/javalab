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

public class data1 
    
{
    int x,y;
void interchange(data1 M1)
{
int t;
t=M1.x;
M1.x=M1.y;
M1.y=t;
System.out.println("after interchanging");
System.out.println("x value of object M1 is"+M1.x);
System.out.println("y value of object M1 is "+M1.y);

}
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    data1 M1=new data1();
   System.out.println("enter the value of x");
   M1.x=sc.nextInt();
   System.out.println("enter the value of y");
   M1.y=sc.nextInt();
   M1.interchange(M1);
}
   
}
    

