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
interface A
{
    int x=10;
    void add();
     void mul();
                    
}
public class interface1 implements A
{
    public void add()
    {
            system.out.println("A.x+A.x");
                    }
    public void mul()
    {
        system.out.println("A.x*A.x");
        
    }
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
                interface c=new intrface();
                        c.add();
                                c.mul();
                                        }
                        
    }
            
    
    

