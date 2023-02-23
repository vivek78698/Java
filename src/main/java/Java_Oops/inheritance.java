package Java_Oops;
class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void printMe(){
        System.out.println("constructor");
    }
    public Base(){
        System.out.println("i am parent class constructor");
    }
    public  Base(int a){
        System.out.println("overloaded constructor of a base class " + a);
    }


}
class Derived extends Base{
int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public Derived(){
        // to pick the argument constructor from base class we use super keyword
    super(5);
        System.out.println("i am a derived class constructor");
    }
}
public class inheritance
{
    public static void main(String[] args) {
    Derived d = new Derived();

    }
}
