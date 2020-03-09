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
public class book
{
  public abstract void read();
}

public class content extends book{

   public void read(){
	System.out.println("java programming");
   }
   public static void main(String args[]){
	book a = new content();
	a.read();
   }
}
    
    

