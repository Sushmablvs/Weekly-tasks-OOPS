import java.util.Random;
import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        Dice obj = new Dice();
        obj.go();
    }
    public void go() {
        Scanner scan = new Scanner(System.in);
        int sides1;
        int sides2;
        System.out.println("How many sides does die 1 have?");
        sides1 = scan.nextInt();
        System.out.println("How many sides does die 2 have?");
        sides2 = scan.nextInt();

        Random random = new Random();
        int i;
        int sum1 =0, sum2 =0;

        for(i=0; i < 3; i++) {
            int roll1 = random.nextInt(sides1) + 1;
            int roll2 = random.nextInt(sides2) + 1;
            sum1 = sum1 + roll1;
            sum2 = sum2 + roll2;
            System.out.println("Die 1 roll" + (i + 1) + "=" + roll1 + ".");
            System.out.println("Die 2 roll" + (i + 1) + "=" + roll2 + ".");
        }
        System.out.println("Die 1 rolled a total of" + sum1 + "and rolled" + (sum1/3.0) + "on average.");
        System.out.println("Die 2 rolled a total of" + sum2 + "and rolled" + (sum2/3.0) + "on average.");
    }
}
