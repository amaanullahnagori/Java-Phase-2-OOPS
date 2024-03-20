

public class InheritanceConstructorP3 {
    public static void main(String[] args) {
        Cuboid cd =new Cuboid();
        Cuboid cf=new Cuboid(3);
        Cuboid c=new Cuboid(20,20,3);
        System.out.println("The volume of Cylinder is "+c.volume());

    }
}
class Rectangle
{
    int length,breath;
     public Rectangle()
     {
         System.out.println("Welcome to rectangle");
     }
     public Rectangle (int l,int b)
     {
         length=l;
         breath =b;
     }
     public  int  area ()
     {
         return length * breath;
     }
}
class Cuboid extends Rectangle
{
    int height ;
    public Cuboid()
    {
        System.out.println("Welcome to the cuboid");
    }
    public Cuboid(int h)
    {

        height =h;
        System.out.println("height of cylinder is "+height);
    }
    public Cuboid (int l,int b,int h)
    {
        super(l,b);
        height =h;
    }
    public long volume()
    {

        return area()*height;
    }

}

