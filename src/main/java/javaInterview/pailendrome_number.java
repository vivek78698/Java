package javaInterview;

import java.util.Scanner;
public class pailendrome_number {
    public static void main(String[] args) {
        System.out.println("Enter the number to check if its palindrome ");
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        int org = numb;
        int rev=0;
        while (numb!=0)
        {
            rev = rev*10 + numb%10;
            numb = numb/10;
        }
        if (org == rev){
            System.out.println(org+" palindrome number");
        }
        else {
            System.out.println("not palindrome number");
        }
    }
}
