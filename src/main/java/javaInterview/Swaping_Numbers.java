package javaInterview;

public class Swaping_Numbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swapping values are "+  a +"  "+ b);
        int t = a;
        a = b ;
        b = t;
        System.out.println("After swapping "+ a+" "+b);
    }
}
