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
public class Refer {
     int x,y;
    void read()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter 2 number");
        this.x=x;
        this.y=y;
        x=Sc.nextInt();
        y=Sc.nextInt();
    }
    void add(Refer R,Refer R1)
    {
      x=R.x+R1.x;
      y=R.y+R1.y;
   
      System.out.println("value of x="+x+"Value of y="+y);
     
    }
    public static void main(String args[])
    {
      //  int x,y;
        Refer R=new Refer();
        R.read();
        Refer R1 = new Refer();
        R1.read();
        Refer R2=new Refer();
        R2.add(R,R1);
        //int z= R1.add(R);
      //  System.out.println("value of y ="+z);
    }
}

    

