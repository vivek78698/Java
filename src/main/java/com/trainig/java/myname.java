package com.trainig.java;

import java.util.Scanner;

public class myname {
    public static void main(String[] args) {
//        StringBuffer sc = new StringBuffer(String.valueOf(12344556));
//        StringBuffer reverse = sc.reverse();
//        System.out.println(reverse);
        System.out.println("Enter the number u want to reverse");
        Scanner sce = new Scanner(System.in);
        int numb = sce.nextInt();


        int rev = 0;
        while (numb!=0){
            rev = rev*10 + numb%10;
            numb = numb/10;
        }
        System.out.println(rev);
    }
}
