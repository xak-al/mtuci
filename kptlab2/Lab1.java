/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point3d;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Lab1 
{
    
    //метод вычисляет площадь треугольника по формуле Герона
    public static double computeArea(Point3d temp1,Point3d temp2,Point3d temp3)
    {
        if (Point3d.CompareTo(temp1,temp2) == true   | Point3d.CompareTo(temp1,temp3) == true  | Point3d.CompareTo(temp3,temp2) == true )
         {
            System.out.println("Incorrect coordinate!");
            return 0;
         }
        
        double A,B,C,P,S;
        
        A = Point3d.distanceTo(temp3,temp2);
        B = Point3d.distanceTo(temp2,temp1);
        C = Point3d.distanceTo(temp3,temp1);
        P = (A +B +C)/2;
        S = Math.sqrt((P*(P-A)*(P-B)*(P-C)));
        return S;
    
    }
    
    //главный метод
    public static void main(String[] args) 
    {
        double x1,y1,z1,x2,y2,z2,x3,y3,z3,S;
        // read inputs
        Scanner in = new Scanner(System.in);
    
        System.out.println("Enter coordinate x1:");
        x1= in.nextDouble();
        System.out.println("Enter coordinate y1:");
        y1= in.nextDouble();
        System.out.println("Enter coordinate z1:");
        z1= in.nextDouble();
        
        Point3d point1 = new Point3d(x1,y1,z1);
        
        System.out.println("Enter coordinate x2:");
        x2= in.nextDouble();
        System.out.println("Enter coordinate y2:");
        y2= in.nextDouble();
        System.out.println("Enter coordinate z2:");
        z2= in.nextDouble();
        
        Point3d point2 = new Point3d(x2,y2,z2);
        
        System.out.println("Enter coordinate x3:");
        x3= in.nextDouble();
        System.out.println("Enter coordinate y3:");
        y3= in.nextDouble();
        System.out.println("Enter coordinate z3:");
        z3= in.nextDouble();
        
        Point3d point3 = new Point3d(x3,y3,z3);
        S = computeArea(point1,point2,point3);
        
        System.out.printf("S= %.2f %n", S);	
        
        //System.out.println("S= " + S );
       
       
       
      
    }
}
