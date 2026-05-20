import java.util.Scanner;

public class SumAndAvgofArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int length = sc.nextInt();

        int[] arr = new int[length];
        int sum = 0;

        System.out.println("Enter the elements of array:");

        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];//at the same time
        }

        System.out.println("Sum of elements of array is: " + sum);

        float avg = (float) sum / length;
        System.out.println("Average of elements of array is: " + avg);
        sc.close();
    }
}


