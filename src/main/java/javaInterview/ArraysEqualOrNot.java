package javaInterview;

import java.util.Arrays;

public class ArraysEqualOrNot {
    public static void main(String[] args) {
        int a[] = {1,4,6};
        int b[]= {1,4,6,7};
       boolean c =  Arrays.equals(a,b);
        System.out.println(c);
    }
}
