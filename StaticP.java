//package com.company;

 class Sttatic1 {
    public static void main(String[] args) {
        Pro p= new Pro ();
       // p.meth1();
        // or
        Pro.meth1(); // you can directly call a static function or variable directly by class name
        //System.out.println(Pro.f);
        //p.meth2();
        Pro p2= new Pro ();
        p2.meth2();

        p2.a=10;
        p2.f=45.2f;
        //p2.fun();

        p2.meth2();

    }
}
class Pro
{
 int a=101;
 static  float  f=424f;
    void fun()
 {
     System.out.println("static " +f);
     System.out.println("instance "+a);
 }

   static void meth1()
    {
        Pro p1= new Pro (); // if you want to use non static member in static function then
        // you have to first make an object then you can use otherwise it will show error
        //System.out.println(p1.a+""+f);
    }
void meth2()
{
    System.out.println(f);
    System.out.println(a);

}

}