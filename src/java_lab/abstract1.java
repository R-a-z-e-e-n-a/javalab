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
public class abstract1 {
    
   
   public abstract void read();
}
//Dog class extends Animal class
public class book extends abstract1{

   public void read(){
	System.out.println("java programming");
   }
   public static void main(String args[]){
	abstract1 a = new book();
	a.read();
   }
}
    

