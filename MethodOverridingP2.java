//package com.company;

 class MethodOverriding4 {
    public static void main(String[] args) {

        Trial t =new Trial ();
        t.method1();
        t.method2();
        System.out.println();
        Trialsub t2=new Trialsub();
        t2.method1();
        t2.method2();
        t2.Method4();
        System.out.println();
        Trial t3=new Trialsub();//dynamic method dispatch
        t3.method2();
        t3.method1();
        //jitni bhi sub class ke under overrided method he vo aur super
        //class ki sari method call kar sakte he  methkod overloadindg se

        //Trialsub t4=new Trial();// not possible
    }
}
class Trial
{
    void method1()
    {
        System.out.println("this is m1");
    }
    void method2()
    {
        System.out.println("this is m2");
    }
}
class Trialsub extends Trial
{
    @Override
    void method1()
    {
        System.out.println("this is m3");
    }
    void Method4()
    {
        System.out.println("this is m4");
    }
}