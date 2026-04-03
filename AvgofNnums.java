import java.util.Scanner;

public class AvgofNnums {
    public static void main(String[] args) {
        int count;

        System.out.print("enter the count : ");
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();

        System.out.print("enter the numbers : ");

        int number, sum = 0;
        float average;

        for (int i = 0; i < count; i++) {
            number = sc.nextInt();
            sum = sum + number;
        }
        average = (float) sum / count;
        System.out.println("the sum is : " + sum);
        System.out.println("the average is : " + average);
        sc.close();
    }
}
