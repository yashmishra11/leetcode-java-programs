class Solution {
    public int totalNumbers(int[] digits) {
        int[] count = new int[10];
        for (int d : digits) count[d]++;

        int ans = 0;

        for(int n = 100; n <= 998; n += 2){
            int a = n/100;
            int b = (n/10) % 10;
            int c = n % 10;

            int[]need = {a, b, c};
            int[]used = new int[10];

            boolean ok = true;
            for(int d: need){
                used[d]++;

                if(used[d] > count[d]){
                    ok = false;
                    break;
                }
            }
            if(ok) ans++;
        }
        return ans;
    }
}
