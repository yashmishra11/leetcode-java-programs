class Solution {
    public boolean isMatch(String s, String p) {
        Boolean[][] dp = new Boolean[s.length() +1][p.length()+1];
        return dfs(0,0,s,p,dp);
    }
    boolean dfs(int i, int j, String s, String p, Boolean[][] dp){

        if(dp[i][j] != null)
        return dp[i][j];

        if (j==p.length())
        return dp[i][j] = (i == s.length());

        boolean first = 
            i<s.length() &&
            (s.charAt(i) == p.charAt(j) ||
            p.charAt(j) =='.');

            if (j+1 < p.length() && p.charAt(j+1) == '*'){

                return dp[i][j]= dfs(i, j+2, s, p, dp) || (first && dfs (i+1, j, s, p, dp));
            }
            return dp[i][j]=
            first && dfs(i+1, j+1, s, p, dp);
    }
}
