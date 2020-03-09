/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab6;

/**
 *
 * @author MCALAB01017
 */
interface X
{
   public void myMethod();
}
interface Y
{
   public void myMethod();
}
class JavaExample implements X, Y
{
   public void myMethod()
   {
       System.out.println("Implementing more than one interfaces");
   }
   //public class mulinheritance
   //{
   public static void main(String args[]){
	   JavaExample obj = new JavaExample();
	   obj.myMethod();
   }
}

    

