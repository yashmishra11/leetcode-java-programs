class Solution {
    public int reverse(int x) {
        int rev = 0;

        while (x != 0){
            int digit = x % 10;

            if (x > Integer.MAX_VALUE/10 || x < Integer.MIN_VALUE)
            return 0;

            rev = rev*10 + digit;
            x /= 10;
        }
        return rev;
    }
}
