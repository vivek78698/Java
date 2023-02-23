package javaInterview;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number to get factorial");
    Scanner sc = new Scanner(System.in);
    int num =  sc.nextInt();
    int fact =1;
    for (int i=1; i<=num;i++)
    {
         fact = fact*(i);
    }
        System.out.println(fact);


    //or
        for (int i=num; i>1;i--)
        {
            fact = fact*i;
        }
}
}
