import java.util.*;

class Solution {
    public static int mySqrt(int x) {
        int i = 1;

        while (i <= x/i){
            i++;
        }
        return i - 1;
    }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.println("enter the number : ");
            int x = sc.nextInt();

            System.out.println("square root is :"+mySqrt(x));
            sc.close();

        }
}
