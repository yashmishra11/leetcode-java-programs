import java.util.Scanner;

public class SumofAll {
    public static void main(String[] args) {
        int count;
        System.out.println("enter the count of numbers: ");
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();
        int number, sum = 0;
        for (int i = 0; i < count; i++) {
            number = sc.nextInt();
            sum = sum + number;
        }
        System.out.println("sum of all numbers is : " + sum);
        sc.close();
    }

}
