class Solution {
    List<Integer> r = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root != null){
            r.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return r;
    }
}
