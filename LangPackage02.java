//package com.company;

public class LangPackage02 {
    public static void main(String[] args) {
       int i=12;
       Integer g=Integer.valueOf(i); // auto boxing
                                    // int k= g.intValue();
       int k=g;   // auto unboxing
        System.out.println(k);

       Integer f=Integer.valueOf("123");
        System.out.println(f);
       try {
           Integer b = Integer.parseInt("1234l"); // if you pass character or string along with integer then it will throw this exp.
         //this method will convert string to integer
           System.out.println(b);
       }
       catch (NumberFormatException e){
           System.out.println("NumberFormatException");
       }
        System.out.println(Integer.toBinaryString(45));
        System.out.println(Integer.valueOf("101101",2));
        Integer m=10000;
        Integer n=100;
        System.out.println(m.equals(n)); // compare whether the reference are holding same value or not
        System.out.println(m.compareTo(n));
        //compareTo()  give +ve number if argument int is less than this Integer
        //compareTo()   give -ve number if argument int is greater than this Integer
        //compareTo()  gives 0 if both argument integer and this integer are equal
        // equals()     compare whether the given references contain the same value or not

    }

}
