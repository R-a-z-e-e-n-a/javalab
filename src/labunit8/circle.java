/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labunit8;

/**
 *
 * @author MCALAB01017
 */
public class circle extends c1
{
    double volume;
    void calculate()
    {
        read();
        volume=pi*r*r;
    }
    void display()
    {
        System.out.println("Radius="+r);
        System.out.println("volume of circle"+volume); 
    }
    public static void main(String args[])
            circle c=new circle;
    c.calculate();
    c.display();
          
    
}
