class Outer 
{
    int x=10;
    public void display()
    {
        System.out.println("display");
    }
    class Inner 
    {
        public void inner (int z)
        { 
            System.out.println(x);
            System.out.println("help me in learning java"); }
    public void inner ()
    {
        System.out.println("no parameter");
    }
    public void inner (int x,int y)
    {
        System.out.println("2 parameter");
    }
    
    }
   
    public void call ()
   {
        int k=14;
       Inner i =new Inner ();
       i.inner (k);
       i.inner(10, k);
       i.inner();
       System.out.println();
   }
}
class NestedClass 
{
    public static void main(String[] args) {
        Outer o=new Outer ();
        o.call();
    }
}
