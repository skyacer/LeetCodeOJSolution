package lowestcommonancestorofabinarysearchtree;

/**
 * No.235 Lowest Common Ancestor of a Binary Search Tree
 * Created by Rocana on 2017/7/17.
 */
public class Solution {
    class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == null || q == null){
            return null;
        }

        while ((root.val - p.val) * (root.val - q.val) > 0){
            root = root.val > p.val ? root.left : root.right;
        }

        return root;
    }

    static void throw1() throws IllegalAccessException {
        System.out.println("Inside throw1 . ");
        throw new IllegalAccessException("demo");
    }
    public static void main(String[] args){
        try {
            throw1();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}
