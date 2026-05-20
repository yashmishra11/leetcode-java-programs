import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.print("Enter the string:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        boolean isPalindrome = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("the string " + str + " is a PALINDROME");
        } else {
            System.out.println("the string " + str + " is not a PALINDROME");
        }
    }
}
