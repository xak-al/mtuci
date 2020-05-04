/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point3d;

/**
 *
 * @author user
 */
public class Point3d {

   //координаты
   private double xCoord;
   private double yCoord;
   private double zCoord;
   
   //констуктор иниц.
   public Point3d(double x,double y,double z)
   {
       xCoord = x;
       yCoord = y;
       zCoord = z;
   }
   
    public Point3d()
   {
       xCoord = 0;
       yCoord = 0;
       zCoord = 0;
   }
   
    //метод возвращ. коорд.Х
    public double getX () 
    {
        return xCoord;
    }
    
    //метод возвращ. коорд.Y
    public double getY () 
    {
        return yCoord;
    }
    //метод возвращ. коорд.Z
     public double getZ () 
    {
        return zCoord;
    }
     
    //метод устанавл. коорд.X
      public double setX (double x) 
    {
         xCoord =x;
         return xCoord;
    }
    
    //метод устанавл. коорд.Y
    public double setY (double y) 
    {
        yCoord =y;
        return yCoord;
    }
    
    //метод устанавл. коорд.Z
     public double setZ (double z) 
    {
        zCoord =z;
        return zCoord;
    }
     
     //метод вычисляет расстояние  между 2 точками.
     static public double distanceTo (Point3d temp1, Point3d temp2)
     {
       return  (Math.sqrt(Math.pow(temp2.getX() - temp1.getX(),2) + Math.pow(temp2.getY() - temp1.getY(),2) +Math.pow(temp2.getZ() - temp1.getZ(),2)));
     }
     
     //метод сравнивает коорд.2 точек
     static public boolean CompareTo (Point3d temp1, Point3d temp2)
     {
       if (temp1.getX() == temp2.getX()  & temp1.getY() == temp2.getY()  & temp1.getZ() == temp2.getZ()) 
           return true; 
       else return false;
     }
   
   
   
}