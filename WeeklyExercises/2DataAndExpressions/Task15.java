import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numerator:");
        int numerator = scanner.nextInt();

        System.out.println("Enter denominator:");
        int denominator = scanner.nextInt();

        int decimal = numerator/denominator;
        System.out.println("The decimal is equal to " + decimal);

    }
}
