package javaInterview;

public class Reverse_String {
    public static void main(String[] args) {
    String s = "vivek";
//    String  rev = "";
//    for (int i = s.length()-1; i>=0; i--)
//    {
//        rev = rev + s.charAt(i);
//    }
//        System.out.println(rev);

    //using StringBuffer Class
        StringBuffer sc = new StringBuffer(s);
        StringBuffer reverse= sc.reverse();
        System.out.println(reverse);
}
}
