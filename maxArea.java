class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1, count = 0;


        while (l<r){
            count = Math.max(count, Math.min(height[l], height[r]) * (r-l));
            if (height[l] < height[r])
            l++;
            else r--;
        }
        return count;
    }
}
