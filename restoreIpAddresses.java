class Solution {
    List<String> ans = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        dfs(s, 0, 0, "");
        return ans;
    }

    void dfs(String s, int i, int parts, String cur){
        if (parts == 4 && i == s.length()) {
            ans.add(cur.substring(0, cur.length()-1));
            return;
        }
        if (parts == 4 || i == s.length()) 
        return;

        for (int len = 1; len <=3 && i+len <= s.length(); len++){
            String p = s.substring(i, i+len);

            if ((p.length() >1 && p.startsWith("0")) || Integer.parseInt(p) > 255) continue;

            dfs(s, i +len, parts +1, cur+p+".");
        }
    }
}
