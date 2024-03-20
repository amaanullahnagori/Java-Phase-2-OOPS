//package com.company;

//import java.util.Scanner;

public class ExceptionHandling06 {
    public static void main(String[] args) {
        //Scanner s = new Scanner(System.in);
        System.out.println("enter the amount");
        //int balance = s.nextInt();
        try {
            area();
        } catch (MyException1 e) {
            System.out.println(e.getMessage());
        }

    }
    public static void area() throws MyException1 {
        int balance = 5;
        if (balance < 3000) {
            System.out.println("money is less then 3000 you cannot withdraw ");
            throw new MyException1("this is not a joke ");
            // anonymous obj is made of MyException
            // 'throw' call the MyException catch block
        } else {
            System.out.println("your can take money from the Account");
        }

    }

}


class MyException1 extends Exception
{
    public MyException1(String s ) {
        System.out.println(s);
    }

    public String toString()
    {
        return "this is Demo for own exception";
    }
    public String tessage()
    {
        return "get message";
    }
}


