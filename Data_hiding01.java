class Data_hiding   // using getter and setter method 
        
{
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
       //r.l=14;
        //r.b=45;
        int w=12;
        r.setLength(w);
       System.out.println("this length is by getLength method  "+r.getLength());
   // System.out.println("the new length is "+b);
  //     System.out.println(r.getLength());
}
}
class Rectangle 
{
    private int l=10;
    private int b=10;
    public double area()
    {
        return l*b;
    }
    int getLength()
    {
        return l;
    }
     void setLength(int length)
    {
        l=length;
        System.out.println("the changed length is "+l);
       // return l;
    }
}