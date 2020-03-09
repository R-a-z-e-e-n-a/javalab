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
class SimpleObject
{
SimpleObject()
{
System.out.println (“No argument Constructor”);
}
SimpleObject(int a)
{
        System.out.println (“One argument Constructor”);
}
}



public class Constructor
{
public static void main(String arg[])
{
new SimpleObject();
new SimpleObject(100);
}
    
}
