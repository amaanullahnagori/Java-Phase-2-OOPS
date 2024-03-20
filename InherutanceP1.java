//package com.compan
        class InheritanceP1 {
    public static void main(String[] args)
    {
Cylinder cy =new Cylinder(45.2178,98.27832);
System.out.println(cy);
    }
}
class Circle          //super class
{
    double radius ;
    private double pi=Math.PI;
    public void  setRadius(double r)
    {
        radius =r;
    }
    public double getRadius()
    {return radius;}
    public double area ()
    {
        return radius *radius *pi;
    }
}
class Cylinder extends Circle   //sub-class
{
    private  double height;
    public double volume ()
    {return area()* height;}
     public Cylinder(double radius,double height)
     {
           this.radius=radius;
           this.height=height;
     }
     public String toString()
     {
         return "Radius of Cylinder is : "+radius+" \nHeight of cylinder is : "+height+"\nThe volume of cylinder is : "+volume();
     }
}