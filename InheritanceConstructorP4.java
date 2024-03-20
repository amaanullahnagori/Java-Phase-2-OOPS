

class InheritanceConstructorP4 {
    public static void main(String[] args) {
        CyliNder c=new CyliNder(12,5);
        System.out.println("the area is "+c.Area());
        System.out.println("the volume is "+c.volume());
         CyliNder c1=new CyliNder(12);
         System.out.println("hi ");

 

    }
}
class CirCle
{
    int radius ;
    public CirCle()
    {
        System.out.println("hey its circle ");
    }
    public CirCle(int radius)
    {
        this.radius=radius ;
          System.out.println("the radius is "+radius );
    }
    public double Area ()
    {
        return Math.PI*radius*radius;
    }
}
class CyliNder extends CirCle
{
    int height ;
     public CyliNder(int height)
     {
         this.height=height;
         System.out.println(height);
     }
     public CyliNder()
     {
         System.out.println("its cylinder ");
     }
     public double volume ()
     {
         return Area()*height;
     }
     public  CyliNder (int height ,int radius )
     {
         super (radius);
         this.height=height ;
          System.out.println("the height is "+height);
     }

}