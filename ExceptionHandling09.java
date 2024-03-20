//package com.company;
import java.util.*;
public class ExceptionHandling09 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("enter length and breadth");
        int length=sc.nextInt();
        int breadth =sc.nextInt();
        try {
            int c = area(length, breadth);
            System.out.println("the arae is " + c);
        }

        catch (MyException3 a)
        {
            System.out.println(a.own1());
            System.out.println(a.toString());
            System.out.println(a.own2());
        }
        catch (Exception e)
        {
            System.out.println(e);
            e.printStackTrace();
        }
    }
    public static int area(int l ,int b) throws MyException3 {

        if (l<0||b<0)
            throw new  MyException3();
        int ara =l*b;
        return ara;
    }
}
class MyException3 extends Exception
{
    public String  own1() {
        return "length and breath cannot be negative";
    }

        @Override
        public String toString()
        {
            return "you have enter negative l & b therefore area is will be negative which is not possible  ";
        }
       public String own2()
   {
       return "try the same with positive length and breath ";

   }

    }
