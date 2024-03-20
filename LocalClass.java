class Outer1
{  
    int x=45;
  
   public void displayOuter()
    {
        System.out.println("outer display");
    
    class Inner1 
    {
        public void displayInner()
        {
            System.out.println("Inner display");
        }        
    }
    
    Inner1 l=new Inner1 ();
    l.displayInner();
   
}
}
class Local
{
    public static void main(String[] args) {
        Outer1 op=new Outer1();
        op.displayOuter();
    }
}
