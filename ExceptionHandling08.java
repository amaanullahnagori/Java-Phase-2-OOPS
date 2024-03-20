//package com.company;

public class ExceptionHandling08 {
    public static void main(String[] args) {
try {
    math2();
}
        catch (Exception e)
        {
            e.printStackTrace();
         }
        System.out.println("    thank you");
    }
    public static void math2() throws Exception
    {
       int b= meth1();
        System.out.println(b);
    }
    public static int meth1() throws Exception
    {
        int a;
       a=10/0;
       return a;
    }

}
