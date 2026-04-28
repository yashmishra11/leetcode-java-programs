import java.util.Scanner;

class Solution {
    public static boolean isPalindromeNum(int number) {
        int rever = 0, temp = number;

        while (temp > 0) {
            int remainder = temp % 10;
            rever = rever * 10 + remainder;
            temp = temp / 10;
        }
        return number == rever;
    }
    public static void main(String[] args) {
        int number = 272;

        if (isPalindromeNum(number)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
