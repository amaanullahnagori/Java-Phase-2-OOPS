class CylenderTest
{
    public static void main(String args[])
    { Cylender c=new Cylender (); 
    c.height=89;
    c.radius=96;
        System.out.printf("The volume is : %.2f",c.volume());
        System.out.println("");
        System.out.printf("The area is : %.2f ",c.area());
        System.out.println("");
                
        
    }
}
class Cylender
{
    int height,radius;
    double area()
    {
        return Math.PI*radius*radius*height;
    }
    double volume()
    {
        return (Math.PI*radius*radius*height)/3;
    }
}