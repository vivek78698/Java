package javaInterview;

public class greatestOf3Numb {
    public static void main(String[] args) {
        int a=12;
        int b= 44;
        int c=55;
      if (a>b && a>c){
          System.out.println(a + "is greatest");
      }
      if (b>a && b>c){
          System.out.println(b + "is greatest");
      } else {
          System.out.println(c+" is greatest");

      }
    }
}
