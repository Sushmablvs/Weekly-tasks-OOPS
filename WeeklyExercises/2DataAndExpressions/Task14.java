
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the square side:");
        int side = scanner.nextInt();

        int area = side * side;
        int perimeter = 4 * side;

        System.out.println("The area is qual to "+ area +".");
        System.out.println("The perimeter is equal ro "+ perimeter +".");

    }
}
