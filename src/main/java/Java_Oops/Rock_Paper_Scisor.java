package Java_Oops;

import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scisor {
    public static void main(String[] args) {
        //0 for rock
        //1 for paper
        //2 for scissor
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock 1 for paper 2 for Scissor");
        int userinput = sc.nextInt();

        Random random = new Random();
        int computerinput = random.nextInt(3);

        if (userinput == computerinput) {
            System.out.println("Draw");
        } else if (userinput == 0 && computerinput == 2 || userinput == 1 && computerinput == 0 || userinput == 2 && computerinput == 1) {
            System.out.println("player wins");
        } else {
            System.out.println("computer wins");
        }
       // System.out.println("computerinput" + computerinput);
        if (computerinput == 0) {
            System.out.println("comp rock");
        } else if (computerinput == 1) {
            System.out.println("comp paper");
        } else if (computerinput == 2) {
            System.out.println("comp scissor");}
    }
}