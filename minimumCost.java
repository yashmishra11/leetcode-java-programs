class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);

        int total = 0;
        int n = cost.length;

        for (int i =0;i<n;i++){
            int posFromLeft = n-1-i;
            if(posFromLeft % 3 == 2) continue;
            total += cost[i];
        }
        return total;
    }
}
