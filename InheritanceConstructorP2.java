package com.company;

public class InheritanceConstructorP2
{
    public static void main(String[] args)
    {
        SwiftDesire S =new SwiftDesire();
    }
}
class Swift
{
     public Swift ()
    {
        System.out.println("pehle Swift bano");
        System.out.println("All new Swift here :)");
    }
}
class SwiftDesire extends Swift
{

   public  SwiftDesire()
    {
        System.out.println("phir Swift Desire banao");
        System.out.println("Swift desire is inherit from Swift ");
        System.out.println("All new Swift Desire here :) ");
    }
}
