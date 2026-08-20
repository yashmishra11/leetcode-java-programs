class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> a = new ArrayList<>(), b = new ArrayList<>();
        a.add(nums[0]); b.add(nums[1]);

        for (int i = 2; i < nums.length; i++)
        (a.get(a.size()-1) > b.get(b.size()-1) ? a:b).add(nums[i]);

        int[] ans = new int[nums.length];
        int k = 0;
        for (int x : a) ans[k++] = x;
        for (int x : b) ans[k++] = x;
        return ans;

    }
}
