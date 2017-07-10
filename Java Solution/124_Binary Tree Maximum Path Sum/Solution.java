/**
 * Created by Rocana on 2017/7/7.
 *  No.124
 */
public class Solution {

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }
    }
    int maxValue = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        findMaxValueDown(root);
        return maxValue;
    }

    private int findMaxValueDown(TreeNode node) {
        if (node == null){
            return 0;
        }
        int left = Math.max(0, findMaxValueDown(node.left));
        int right = Math.max(0, findMaxValueDown(node.right));
        maxValue = Math.max(maxValue, left + right + node.val);
        return Math.max(left, right) + node.val;
    }


    private TreeNode getRoot(){
        TreeNode root = new TreeNode(-100);
        root.left = new TreeNode(4);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(4);
        root.right.left.left = new TreeNode(1);
        root.right.left.right = new TreeNode(2);
        root.right.right.left = new TreeNode(3);
        root.right.right.right = new TreeNode(4);
        return root;
    }

    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.maxPathSum(s.getRoot()));
    }
}
