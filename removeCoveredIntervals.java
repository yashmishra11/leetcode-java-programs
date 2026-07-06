class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0]==b[0] ? b[1] - a[1] : a[0] - b[0]);

        int count = 0; int end = 0;

        for (int [] in : intervals) {
            if (in [1] > end){
                count++;
                end = in[1];
            }
        }

        return count;
    }
}
