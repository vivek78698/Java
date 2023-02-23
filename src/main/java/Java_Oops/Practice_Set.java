package Java_Oops;
class Cylinder {
    int radius;
    int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea() {
        return (2 * 3.14 * radius * radius + 2 * 3.14 * radius * height);
    }

    public double volume() {
        return (3.14 * radius * radius * height);


    }
}

    class Rectangle{
        private int lenght;
        private int breath;

        public Rectangle() {
            this.lenght = 4;
            this.breath = 5;
        }

        public Rectangle(int lenght, int breath) {
            this.lenght = lenght;
            this.breath = breath;
        }
        public int getLenght() {
            return lenght;
        }
        public int getBreath() {
            return breath;
        }
    }
public class Practice_Set {
    public static void main(String[] args) {
        //problem1
        /*
    Cylinder cylinder = new Cylinder();
    cylinder.setHeight(12);
    cylinder.setRadius(22);
        System.out.println(cylinder.getHeight());
        System.out.println(cylinder.getRadius());*/
        //problem 2
//        Cylinder cylinder = new Cylinder(9,12);
//        cylinder.setHeight(12);
//        cylinder.setRadius(22);
//        System.out.println(cylinder.getHeight());
//        System.out.println(cylinder.getRadius());
//        System.out.println(cylinder.surfaceArea());
//        System.out.println(cylinder.volume());
//        //problem 3
        Rectangle rectangle = new Rectangle(12,56);
        System.out.println(rectangle.getLenght());
        System.out.println(rectangle.getBreath());


    }
}
