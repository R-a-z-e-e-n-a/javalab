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
public class StringEq 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first string");
        String str1=sc.next();
        System.out.println("enter the second string");
        String str2=sc.next();
                if(str1.equals(str2))
                {
                System.out.println("strings are equal");
                }
                else
                {
                    System.out.println("strings are not equal");
                }
                
    }
}
    
    
    
}
