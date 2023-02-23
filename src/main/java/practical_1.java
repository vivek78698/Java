import java.util.Scanner;
class vivek{
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public vivek(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
 public class practical_1 {
     static int fact(int n){
             if (n == 0 || n == 1) {
                 return 1;
             } else {
                 return (n * fact(n - 1));
             }
     }
     public static void main(String[] args) {
             //factorial of a number
             System.out.println("Enter the no to get fact");
             Scanner sc = new Scanner(System.in);
             int aa = sc.nextInt();
             int f = 1;
             f = fact(aa);
             System.out.println("factorial is " + f);
         }
     }