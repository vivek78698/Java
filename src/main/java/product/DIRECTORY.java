package product;
import java.util.*;
public class DIRECTORY {
    public static <iterator> void main(String[] args) {
//        File f = new File("src/main/java/product/myfile");
//        if (f.mkdirs()) {
//            System.out.println("done");
//        }
//        else {
//            System.out.println("not created");
//        }
//        ArrayList carName = new ArrayList<String>();
//        carName.add("Honda");
//        carName.add("volvo");
//        carName.add("Handa");
//        carName.add("maruti");
//      //  System.out.println(carName);
//      /*  carName.set(2,"thar");
//        System.out.println(carName);
//        carName.remove(2);
//        System.out.println(carName);
//        carName.hashCode();
//        System.out.println(carName);
//        carName.add(2,"123");
//        System.out.println(carName);
//        System.out.println("size of array is "+ carName.size());*/
//        Iterator  iterator = carName.iterator();
//        while( iterator.hasNext()){
//            System.out.print(iterator.next()+" ");
//        }
        ArrayList<Integer> a1 = new ArrayList<>();
      //  ArrayList<Integer>a2 = new ArrayList<>(4);
        //a2.add(99);
        a1.add(4);
        a1.add(6);
        a1.add(2);
        a1.add(1);
        a1.add(6);
        a1.add(7);
        a1.add(0,2);
      //  a1.addAll(a2);
//        for (int i =0; i<a1.size() ; i++){
//            System.out.println(a1.get(i));

            Iterator iterator = a1.iterator();
            while(iterator.hasNext())
                System.out.print(iterator.next()+ " " );
        }
    }


