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
public class sumofdigit {
     public static void main(String args[])
       {
           int n,m=0,sum=0;
          // int a[]=new int[20];
           
           Scanner sc=new Scanner(System.in);
           
           System.out.println("enter the number");
           n=sc.nextInt();
                 
           
           
           while(n>0)
           {
               m=n%10;
               sum=sum+m;
               n=n/10;
              // i++;
           }
          System.out.println("Sum is:" + sum);
       
       }
   }

    
