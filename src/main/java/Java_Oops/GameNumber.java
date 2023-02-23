package Java_Oops;

//class Game{
//    public int number;
//    public int noOfGuesses;
//    public int getNoOfGuesses() {
//        return noOfGuesses;
//    }
//
//    public void setNoOfGuesses(int noOfGuesses) {
//        this.noOfGuesses = noOfGuesses;
//    }
//    public  Game(){
//        Random rand = new Random() ;
//        rand.nextInt(100);
//    }
//    public int takeUserInput(){
//        System.out.println("guess the number");
//        Scanner sc = new Scanner(System.in);
//       int inputNumber=  sc.nextInt();
//       return inputNumber;
//
//    }
//    boolean isCorrectNumber(int num){
//        if (num==number){
//            return true;
//        } else if (num<number) {
//            System.out.println("Too low.....");
//        }else if (num>number) {
//            System.out.println("Too high.....");}
//        return false;
//    }
//    public void noOfGuesses(){
//
//    }
//
//}
//public class GameNumber {
//    public static void main(String[] args) {
//        Game g = new Game();
//        g.takeUserInput();
//        boolean b = g.isCorrectNumber();
//        System.out.println(b);
//
//
//    }
//}