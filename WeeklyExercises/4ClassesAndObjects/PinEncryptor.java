import java.util.Random;
import java.util.Scanner;

public class PinEncryptor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Prompt the user to enter a four-digit PIN
        System.out.print("Enter a four-digit PIN number to encrypt: ");
        int pin = scanner.nextInt();

        // Check if the entered PIN is four digits
        if (pin < 1000 || pin > 9999) {
            System.out.println("Invalid PIN. Please enter a four-digit PIN.");
            return; // Exit the program
        }

        // Generate two random numbers greater than 1000 and less than 65536
        int random1 = random.nextInt(64535) + 1000;
        int random2 = random.nextInt(64535) + 1000;

        // Convert pin number to hexadecimal
        String pinHex = Integer.toHexString(pin);

        // Concatenate the random numbers and encrypted PIN
        String encryptedPin = Integer.toHexString(random1) + pinHex + Integer.toHexString(random2);

        System.out.println("Your encrypted pin number is " + encryptedPin.toUpperCase());
    }
}
