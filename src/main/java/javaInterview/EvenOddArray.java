package javaInterview;

public class EvenOddArray {
    public static void main(String[] args) {
        int a[] = {1,3,5,67,55,44,22};
        int even =0;
        int odd = 0;
        for (int i = 0; i< a.length; i++)
        {
            if (a[i]%2==0){
                System.out.println( a[i]);
            }else {
                System.out.print(+a[i]);
            }
        }
    }
}
