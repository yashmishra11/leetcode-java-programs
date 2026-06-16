class Solution {
    public boolean isBalanced(TreeNode root) {
        return f(root) >=0 ;
    }
    int f(TreeNode n ){
        if (n == null) return 0;

        int l = f(n.left), r = f(n.right);

        if (l<0||r<0||Math.abs(l-r)>1)
        return -1;
        else
        return 1+Math.max(l,r);
    }
}
