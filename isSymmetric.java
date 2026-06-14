class Solution {
    public boolean isSymmetric(TreeNode root) {
        return root ==null || f(root.left, root.right);        
    }
    boolean f(TreeNode a, TreeNode b){
        return a==null|| b == null
        ? a==b
        : a.val == b.val && f(a.left, b.right) && f(a.right, b.left);
    }
}
