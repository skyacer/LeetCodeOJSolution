package lowestcommonancestorofabinarytree;

import util.TreeNode;

import java.util.*;

/**
 * No.236 Lowest Common Ancestor of a Binary Tree
 * Created by Rocana on 2017/7/24.
 */
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //key is node, value is node's parent
        Map<TreeNode, TreeNode> parent = new HashMap<>();
        Stack<TreeNode> stack = new Stack<>();
        parent.put(root, null);
        stack.push(root);
        while (!parent.containsKey(p) || !parent.containsKey(q)){
            TreeNode node;
            if (!stack.empty()) {
                node = stack.pop();
            }else {
                return null;
            }
            if (node != null && node.left != null){
                parent.put(node.left, node);
                stack.push(node.left);
            }
            if (node != null && node.right != null){
                parent.put(node.right, node);
                stack.push(node.right);
            }
        }
        List<TreeNode> curseRootPath = new LinkedList<>();

        while (p!=null){
            curseRootPath.add(p);
            p = parent.get(p);
        }

        while (!curseRootPath.contains(q)){
            q = parent.get(q);
        }
        return q;
    }

    public static void main(String[] args){
        Solution s = new Solution();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        root.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        s.lowestCommonAncestor(root, root.left, root.left.right.left);
    }
}
