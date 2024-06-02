import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        //MILES_TO_KILOMETERS
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter distance in miles:");
        double miles = scanner.nextDouble();
        double kilometers = miles * 1.60935;

        System.out.println(miles+" miles is equal to " +kilometers + " kilometers.");



    }
}
