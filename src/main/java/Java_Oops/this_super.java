package Java_Oops;
class EkClass {
    int a;

    public int getA() {
        return a;
    }
// this is used for refrance
    EkClass(int a) {
        this.a = a;
    }
    public int returnone(){
        return 1;
    }

}
class DoClass extends EkClass{
    DoClass(int c){
        super(c);
        System.out.println("i am a constructor");
    }
}
public class this_super {
    public static void main(String[] args) {
    EkClass e = new EkClass(65);
        System.out.println(e.getA());
        DoClass d = new DoClass(5);

    }
}
