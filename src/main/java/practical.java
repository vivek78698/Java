public class practical {
    public static void main(String[] args) {

        for (int i= 1; i<5;i++){
           for (int j = 0; j<5;j++){
               if (j==1 )
               System.out.print("^");
           }System.out.println();
        }

    } }


//1
//12
//123
//1234
//12345

/*
public class fibonacci {
    public static void main(String[] args) {
        int a=0,b=1;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of nth term:");
        int n= sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++) {
            System.out.print(a+", ");

            int fib=a+b;
            a=b;
            b=fib;
        }*/