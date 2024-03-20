//package com.company;

public class LangPackage05 {
    public static void main(String[] args) {
        // string vs StringBuilder vs StringBuffer
        StringBuilder s1=new StringBuilder("Amaan");
        String s2="Amaan";
        StringBuffer s3=new StringBuffer("Amaan");
        s1.append("Nagori");
        s2.concat("Nagori");
        s3.append("Nagori");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}

