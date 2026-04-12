import java.util.Scanner;

public class SumofAllDigits { // of an integer (1+2+3 = 6)
    public static void main(String[] args) {
        int number;
        System.out.println("enter the number:");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        int sum = 0;
        if (number == 0) {
            System.out.println("Input is 0, Loop skipped successfully.");
            return;
        }
        while (number > 0)
        {
            int lastDigit = number % 10;
            number = number / 10;
            sum = sum + lastDigit;
        }
        System.out.println("sum of all digits is " + sum);
    }
}
