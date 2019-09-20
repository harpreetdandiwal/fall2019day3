package com;

public class lambton {
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        String s3=s2;
        String s4 =new String("hello");

        if (s1==s2)
        {
            System.out.println("s1==s2");

        }
        else {
            System.out.println("s1 not==s2");
        }
        if (s3==s2)
        {
            System.out.println("s3==s2");

        }
        else {
            System.out.println("s3 not==s2");
        }
        if (s1==s4)
        {
            System.out.println("s1==s4");

        }
        else {
            System.out.println("s1 not==s4");
        }
        System.out.println(s1);
      s1=s1.toLowerCase();
        s1=s1.toUpperCase();
        System.out.println(s1);
        String collegename="lambton college in toronto";
        System.out.println(collegename.charAt(10));
        System.out.println(collegename.length());
        System.out.println(collegename.toLowerCase());
        System.out.println(collegename.toUpperCase());
        System.out.println(collegename.contains("college"));
        System.out.println(collegename.replace("toronto","newyork"));
        System.out.println(collegename.substring(11,20));
        System.out.println(collegename.toCharArray());
        System.out.println(collegename.concat(" 265 yorkland blvd, northyork "));







    }
}
