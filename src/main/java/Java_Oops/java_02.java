package Java_Oops;
////problem1
//class Employee1 {
//    int salary;
//    String name;
//    public String getName(){
//    return name;
//    }
//    public int getSalary(){
//        return salary;
//    }
//    public void setName(String n ){
//    name=n;
//    }
//}
//public class java_02 {
//    public static void main(String[] args) {
//        Employee1 vivek = new Employee1();
//        vivek.setName("vivek");
//        System.out.println(vivek.getName());
//        vivek.salary=12000;
//        System.out.println(vivek.getSalary());
//problem 2
//class cellphone{
//    public void ringing(){
//        System.out.println("ringing....");
//    }
//    public void vibrating(){
//        System.out.println("vibrating...");
//    }
//    public void callFriend(){
//        System.out.println("calling john...");
//    }
//}

//problem3
class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
class Tommy{
    public void running(){
        System.out.println("running from enemy....");
    }
    public void hitting(){
        System.out.println("hitting the enemy....");
    }
    public void fire(){
        System.out.println("firing at enemy.....");
    }
}

public class java_02 {
    public static void main(String[] args) {
//problem 2
//        cellphone c1 = new cellphone();
//        c1.callFriend();
//        c1.vibrating();
//        c1.ringing();

     //   problem 3
//        square sq = new square();
//        sq.side = 3;
//        System.out.println(sq.area());
//        System.out.println(sq.perimeter());

        Tommy player1 = new Tommy();
        player1.fire();
        player1.running();
        player1.hitting();



        int y=3;
        int z =4;
         int x = ++z;
        System.out.println( ++z + y - y + z + x++);//z = 5,y=0,z=4, x= 3
        System.out.println(x);
        System.out.println(10+10+"hello");
        System.out.println("hello"+10+10);

    }
    }

