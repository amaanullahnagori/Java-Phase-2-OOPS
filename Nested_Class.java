class Outer 
{
    int x=10;
    public void display()
    {
        System.out.println("display");
    }
    public Outer(int x,int y)
    { 
        System.out.println(" paramatrize constructor of oute"
                + "r class is called");
    }
     public Outer()
    { 
        System.out.println("non parametrize constructor of outetr class is called");
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
   
/*    public void call ()
   {
        int k=14;
       Inner i =new Inner ();      // THIS THING ARE NOT REQUIRED NOW 
       i.inner (k);
       i.inner(10, k);
       i.inner();
       System.out.println();
   }*/
}
class NestedClass 
{
    public static void main(String[] args) {
       Outer.Inner  o=new Outer(). new Inner ();// directly you have made object of 
        // inner class 
    Outer.Inner  p=new Outer(10,10). new Inner ();
     o.inner(10, 0);
     o.inner();
     o.inner(12);
     Outer t=new Outer();
        System.out.println(t.x);
       t.display();
     
    }
}


