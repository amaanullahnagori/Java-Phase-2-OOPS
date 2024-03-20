//package com.company;

public class LangPackage03 {
    public static void main(String[] args) {
Float f=Float.valueOf(45.6f);
float j= f.floatValue();
Float k=Float.valueOf(j);
Float o=-14/0f;
Float a =(float)Math.sqrt(22.1);
        Float b =(float)Math.sqrt(-1);
        System.out.println(o.isInfinite());
        System.out.println(a.isNaN());
        System.out.println(b.isNaN());
        System.out.println(Float.NEGATIVE_INFINITY);
        System.out.println(Float.POSITIVE_INFINITY);
StringBuilder s=new StringBuilder("amaan");
    System.out.println(s.reverse());
        System.out.println(s.replace(1,2,"j")) ;
    }
}
