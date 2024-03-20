//package com.company;

public class LangPackage04 {
    public static void main(String[] args) {
   //     code to reverse the string
       // eg - input -> Amaan
     //   output -> naamA
        StringBuilder str = new StringBuilder("hello");
        System.out.println(str);

        for (int i = 0; i < (str.length()) / 2; i++) {
            char c = str.charAt(i);
            char o = str.charAt(str.length() - 1 - i);
            int indexOfLast = (str.length() - 1 - i);
            int indexOfFirst = (i);
            str.setCharAt(indexOfFirst, o);
            str.setCharAt(indexOfLast, c);

        }
        System.out.println(str);
    }
}
//
//        StringBuilder s = new StringBuilder("hello");
//      System.out.println(s.reverse());
//        s.reverse();
//        System.out.println(s);
//    }
//}

