import java.util.Scanner;
public class Task12
{
    public static void main(String[] args)
    {
        int val1, val2, val3;
        double average;
        Scanner scan = new Scanner(System.in) ;

        // get three values from user
        System.out.println("Please enter three integers and " +
                "I will compute their average");


        System.out.println("Enter val1:");
        val1 = scan.nextInt();

        System.out.println("Enter val2:");
        val2 = scan.nextInt();

        System.out.println("Enter val3:");
        val3 = scan.nextInt();

        average = (val1+val2+val3)/3;
        System.out.println("The average is:"+average+".");


    }
}

