class Solution {
    int l, r;
    public String longestPalindrome(String s) {
        for (int i = 0; i < s.length(); i++){
            expand(s, i, i);
            expand(s, i, i+1);
        }     
        return s.substring(l, r+1);
    }
    void expand(String s, int a, int b){
        while (a >= 0 && b<s.length() && s.charAt(a) == s.charAt(b)){
            a--;
            b++;
        }
        if (b-a-1>r-l+1){
            l = a+1;
            r  = b-1;
        }
    }
}
