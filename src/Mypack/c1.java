/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mypack;

/**
 *
 * @author MCALAB01017
 */
import java.util.*;
public class c1 
{
    public double pi=3.14;
    public double r;
    protected void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius of the circle");
        r=sc.nextDouble();
    }
    public static void main(String args[])
    {
        c1 ob=new c1();
        ob.read();
    }
    }
    

