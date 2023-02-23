package product;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_Reader {
    public static void main(String[] args) {
        try {
            FileWriter filewrite = new FileWriter("C:\\Users\\Hp\\OneDrive\\Desktop\\hello.txt");
            filewrite.write("this is my file " + "\r" + " thank u good bye");
            filewrite.close();

            FileReader fr = new FileReader("C:\\Users\\Hp\\OneDrive\\Desktop\\hello.txt");
            int i = 0;
            String mystring = "";
            while ((i = fr.read()) != -1) {
                char ch = (char) i;
                mystring += String.valueOf(ch);
            }

            String[] srr = mystring.split(" ");
            mystring = "";
            for (String s1 : srr) {
                String newString = s1.substring(0, 1).toUpperCase() + s1.substring(1) + " ";
                mystring += newString;
            }

            System.out.println("new string = " + mystring);
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
