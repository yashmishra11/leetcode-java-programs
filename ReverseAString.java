import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        System.out.println("Enter the string to reverse:");

        Scanner st = new Scanner(System.in);
        String str = st.nextLine();// entireline
        String reversedStr = "";
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            reversedStr = ch + reversedStr;
        }
        System.out.println("Reversed string: " + reversedStr);
        st.close();

    }
}

