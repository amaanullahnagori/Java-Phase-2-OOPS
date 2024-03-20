//package com.company;

public class AbstractP1 {
    public static void main(String[] args) {
       Shape s=new Circle1();
       System.out.printf( "%f",s.area());
        System.out.printf("%f",s.parimeter());
        Shape s1=new Rectangle1();
        System.out.println( s1.area());
        System.out.println(s1.parimeter());
        Shape s2=new Triangle();
        System.out.println( s2.area());
        System.out.println(s2.parimeter());
    }
}
 abstract class Shape
{
    abstract double area ();
    abstract double parimeter ();

}
class Circle1 extends Shape
{
    int r=5;
    @Override
    double area ()
    {
       return  Math.PI*r*r;
    }
    @Override
    double parimeter ()
    {
        return 2*Math.PI*r;
    }
}
class Rectangle1 extends Shape
{
    int length=54,breadth=78 ;

    @Override
    double area() {
        return length*breadth;
    }

    @Override
    double parimeter() {
        return 2*(length+breadth);
    }
}
class Triangle extends Shape
{
    int height=98,base=4 ;

    @Override
    double parimeter() {
        return 0;
    }

    @Override
    double area() {
        return (height*base)/2;
    }
}