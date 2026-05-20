import java.util.*;

class Solution {
    public static int lengthOfLastWord(String s) {
        s = s.trim();

        if(s.isEmpty()) return 0;

        String[] words = s.split("\\s+");
        return words[words.length - 1].length();
    }
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("enter your string : ");
            String input = sc.nextLine();

            int result = lengthOfLastWord(input);
            System.out.println("Length of the last word is: " +result);

            sc.close();
        }
}
