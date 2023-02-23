package product;

import java.io.FileInputStream;
import java.util.Scanner;

public class Fiel_Input{
        public static void main(String[] args) throws Exception {
            FileInputStream fo = new FileInputStream("src/main/java/product/reader.txt");
            Scanner sc = new Scanner(fo);
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }		sc.close();
        }
    }
//[Delhi, Amsterdam, Chandigarh, Rohtak, Mumbai]