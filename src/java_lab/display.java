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
public class display {
    
    private int x;
    
    private display()
    {
        System.out.println("java programming");
        x = 5;
    }
    public static void main(String[] args)
    {
        display d = new display();
        System.out.println("Value of x = " + d.x);
    }
}
    

