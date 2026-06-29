class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE, ans = 0;
        for (int x : prices){
            min = Math.min(min, x);
            ans = Math.max(ans, x-min);
        }
        return ans;
    }
}
