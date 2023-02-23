package product;
import java.util.*;

public class Hash_set {
    public static void main(String[] args) {
        Set<String> s1 = new LinkedHashSet<>();
        //no sequence generated

        s1.add("5");
        s1.add("44");
        s1.add("544");
        s1.add("55");
        HashSet<String > h1 = new LinkedHashSet<>();
        h1.add("555");
        h1.add("5555");
        h1.add("666");
        h1.add("433");
        s1.addAll(h1);
        System.out.println(s1);
        if (s1.isEmpty()) {
            System.out.println("empty");
        } else {
            System.out.println("filled");
        }
        System.out.println(s1.contains("666"));
        s1.remove("433");

        System.out.println(s1);
        System.out.println(s1.size());
        s1.clear();
        System.out.println(s1);
        // linkedHash set maintains order of element.
    }
    }


