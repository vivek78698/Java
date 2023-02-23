package javaInterview;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number u want to get reversed");
        int numb = sc.nextInt();///1234
//        int rev = 0;
//        while (numb != 0) {
//            rev = rev*10 + numb%10;//1234 = 0+ 1234%10(4)= 4
//            numb = numb/10; // 123

       // System.out.println("Reversed numb is  "+ rev);
        StringBuffer s = new StringBuffer(String.valueOf(numb));
        StringBuffer reverse = s.reverse();
        System.out.println(reverse);
    }

     }
