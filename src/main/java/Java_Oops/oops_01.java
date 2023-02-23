package Java_Oops;

class Employee{
    int id;
    int salary;
    String name;
    public void PrintDetails(){
        System.out.println("my id is "+ id);
        System.out.println(" and my name is "+ name);
    }
    public int getSalary(){
        return salary;
    }
}
public class oops_01 {
    public static void main(String[] args) {
        Employee harry = new Employee();
        harry.id = 23;
        harry.name = "Harry";
        harry.PrintDetails();
        Employee vivek = new Employee();
        vivek.id = 22;
        vivek.name = "vivek";
        vivek.salary = 12000;
        vivek.PrintDetails();
        int salary = vivek.getSalary();
        System.out.println(salary);
    }
    }