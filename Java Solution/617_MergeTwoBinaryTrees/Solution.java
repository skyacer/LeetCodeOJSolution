package MergeTwoBinaryTrees;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 617. Merge Two Binary Trees
 * Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not.
 * You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.
 * Created by Rocana on 2017/9/13.
 */
public class Solution {
    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null){
            return null;
        }
        int val = (t1 == null ? 0 : t1.val) + (t2 == null ? 0 : t2.val);

        TreeNode result = new TreeNode(val);

        result.left = mergeTrees(t1 == null ? null : t1.left, t2 == null ? null : t2.left);
        result.right = mergeTrees(t1 == null ? null : t1.right, t2 == null ? null : t2.right);

        return result;
    }

    public static void main(String[] args){
        TreeNode t1 = new TreeNode(1);
        t1.left =  new TreeNode(2);
        t1.right = new TreeNode(3);

        TreeNode t2 = new TreeNode(4);
        t2.left = new TreeNode(5);

        mergeTrees(t1, t2);
    }
}
