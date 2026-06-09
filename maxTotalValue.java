class Solution {
    public long maxTotalValue(int[] nums, int k) {

        int globalMax = nums[0];
        for (int num : nums){
            if(num > globalMax){
                globalMax = num;
            }
        }
        
        int globalMin= nums[0];
        for (int num: nums){
            if(num<globalMin){
                globalMin = num;
            }
        }
        long result = (long) globalMax - globalMin;

        return result*k;
    }
}
