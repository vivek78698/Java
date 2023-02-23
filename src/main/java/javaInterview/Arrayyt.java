package javaInterview;

import java.util.Scanner;

public class Arrayyt {
    public static void main(String[] args) {
        //pailendrome number 232
        Scanner sc = new Scanner(System.in);
        System.out.println("enter to check if it is pailendrome or not");
        int numb = sc.nextInt();
        int rev = 0;
        while (numb!=0){
        rev = rev*10 + numb%10;
        numb = numb/10;
        }if (numb == rev){
            System.out.println(numb+" palindrome number");
        }
        else {
            System.out.println("not palindrome number");
        }
    }
}
