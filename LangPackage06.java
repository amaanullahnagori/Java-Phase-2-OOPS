//package com.company;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class LangPackage06
        {
            public static void main(String[] args) {
                // Reflection class
                Class c=My.class;
                System.out.println(c.getClass());
               Field[] f= c.getDeclaredFields();
                Method[]m=c.getMethods();
                Constructor [] x=c.getConstructors();
                for(Constructor cons:x)
                {
                    System.out.println(cons);
                }
                for (Method meth:m){
                    System.out.println(meth);
                }
                for (Field var:f)
                {
                    System.out.println(var);
                }
            }
        }
class My
{
    public int a=10;
    protected int b=45;
    int c=45;
    private int  d=11;

    public My(){}
    public My(String str1 ,String str2){}

    public void meth1 (){}
    public void meth2(int a,int b){}
}