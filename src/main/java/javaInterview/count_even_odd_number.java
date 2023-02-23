package javaInterview;

public class count_even_odd_number {
    public static void main(String[] args) {
        int num = 123456;
        int counteven = 0 ;
        int countodd = 0 ;
        while (num>0)
        {
           int rem =  num%10;
           if (rem%2==0){
               counteven++;
        }else {
               countodd++;
           }num = num/10;
        }
    }
}
