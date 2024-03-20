

class Constructor1// constructor  without any perimeter or mainly the practise of data hiding
{
    public static void main(String args[])
    {
        Rectangle r=new Rectangle ();
       double  a = r.area();
      System.out.println( "the previous length is : "+r.getlength());
        System.out.println("Area : " +a);
r.setLength(45);// after changing the length you have to call the function again if you dont --
// --call then it will print the same value which is inside the it priviously 
 System.out.println( "the new length : "+r.getlength());   
System.out.println("Area : " +r.area());// here  i have call the area again so that 
  // it can recalculate the area with new length   
     
    }
}
class Rectangle 
{
   private  int length =10;
    private  int breath=50; 
    public double area()
    {
        return length*breath;
    }
    int getlength()
    {
        return length ;
    }
    void setLength(int l)
    {
        length =l;
       
    }
}