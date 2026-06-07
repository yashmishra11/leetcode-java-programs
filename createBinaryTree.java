import java.util.*;

public class Solution {
    static class Treenode{
        int val;
        Treenode left;
        Treenode right;

        Treenode(int val){
            this.val = val;
        }
    }
    public TreeNode createBinaryTree(int[][] descriptions) {

        Map<Integer, TreeNode> nodeMap = new HashMap<>();
        Set<Integer> childset = new HashSet<>();

        for (int[] desc : descriptions) {
            int parentVal = desc[0];
            int childVal = desc[1];
            int isLeft = desc[2];

            nodeMap.putIfAbsent(parentVal, new TreeNode(parentVal));
            nodeMap.putIfAbsent(childVal, new TreeNode(childVal));


            TreeNode parentNode = nodeMap.get(parentVal);
            TreeNode childNode = nodeMap.get(childVal);

            if (desc[2] == 1) parentNode.left = childNode;
            else parentNode.right = childNode;
            childset.add(desc[1]);
        }

        for (int key : nodeMap.keySet())
            if (!childset.contains(key)) return nodeMap.get(key);

        return null;
    }
}
