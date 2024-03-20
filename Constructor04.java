class Constructor03
{
    public static void main(String[] args) {
    Cylender cy=new Cylender(10,45);
        System.out.println(cy.getradius());
        System.out.println(cy.getheight());
        
}
}
class Cylender 
{
    int radius=20 ;
    int height=30;
    public Cylender(int radius ,int height )
    {      this.radius =radius ;
             this .height=height;
    }
   public int getheight()
   {
       return height;
   }
public int getradius()
{
    return radius;
}
}