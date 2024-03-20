//package com.company;

public class LangPackage01 {
    public static void main(String[] args) {
        Object o = new Object();
        Object o1 = new Object();
        System.out.println(o.getClass());
        System.out.println(o.hashCode());
        System.out.println(o);
        System.out.println(); // other method includes
//   notify() notifyAll() wait() toString()
        System.out.println();
        System.out.println(o1.hashCode());
        System.out.println(o1.getClass());
        System.out.println(o1.hashCode());
        System.out.println(o1);
        System.out.println();
        System.out.println();

        Amaa a =new Amaa();
        Object p;
        p=a;

        System.out.println(a.hashCode());
        System.out.println(a.getClass());
        System.out.println(a.hashCode());
        System.out.println(a);
        System.out.println();
        System.out.println();
        System.out.println(p.hashCode());
        System.out.println(p.getClass());
        System.out.println(p.hashCode());
        System.out.println(p);
        System.out.println("this method compare where the references are point toward same object or not "+a.equals(p));
    }
    }

class Amaa extends Object
{

public String toString ()
{
    return "hello";
}

}
