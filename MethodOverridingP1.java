import java.lang.*;
 class MethodOverriding {
    public static void main(String[] args) {
        Super s1=new Super();
        s1.display();
        Sub s2 =new Sub ();
        s2.display ();
        Sub s3 =new Sub (10);
        Sub s4=new Sub (12,4);
        Super s5=new Sub ();//Dynamic Method dispatch
        s5.display();


        /*       output ------>
                 non param Super
                 Amaan
                 non param constructor of  Super
                 non param constructor of  Sub
                 LAPTOP
                 non param constructor of Super
                 param constructor of sub
                 hello
                 LAPTOP
                 */



    }
}
class Super
{
     public Super ()
    {
        System.out.println("non pram constructor of  Super");
    }
    Super (int a)
    {
        System.out.println("hello");
    }
    void display ()
    {
        System.out.println("AMAAN");

    }

}

class Sub extends Super {
    public Sub() {
        System.out.println("non param constructor of sub ");
    }
    public Sub(int c) {
        System.out.println("param constructor of sub ");
    }
@Override
    void display() {
        System.out.println("LAPTOP");
    }
    public Sub (int a,int b)
    {
        super (a);
    }
}
