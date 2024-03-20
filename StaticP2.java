
//package com.company;
class NonStaticVariableCalling

        {

public static int a=20;

public int b=10;

public static void add()

        {

        int c=14;

NonStaticVariableCalling m=new NonStaticVariableCalling();

        int sum=c+a+m.b;

        System.out.println(sum);

        }

public void mul()

        {

        int z=24;

        int s=z*a*b;

        System.out.println(s);

        }



public static void main(String[] args)

        {

        NonStaticVariableCalling n=new NonStaticVariableCalling();

        n.mul();

        add();

        }

        }

