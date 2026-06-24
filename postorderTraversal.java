class Solution {
    List<Integer> r = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            r.add(root.val);
        }
        return r;
    }
}
