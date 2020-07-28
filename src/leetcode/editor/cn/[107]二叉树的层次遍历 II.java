//给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历） 
//
// 例如： 
//给定二叉树 [3,9,20,null,null,15,7], 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7
// 
//
// 返回其自底向上的层次遍历为： 
//
// [
//  [15,7],
//  [9,20],
//  [3]
//]
// 
// Related Topics 树 广度优先搜索 
// 👍 268 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.ArrayList;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> leftresult = new ArrayList<List<Integer>>();
        List<List<Integer>> rightresult = new ArrayList<List<Integer>>();
        if (root == null) return null;
        levelOrderBottom(root.left);

    }
    public List<Integer> levelOrder(TreeNode root) {
        List<Integer> temp = new ArrayList<Integer>();
        if (root == null) return temp;
        if(root.left == null && root.right == null) return temp;
        if(root.left != null) temp.add(root.left.val);
        if(root.right != null) temp.add(root.right.val);
        return temp;
    }

}
//leetcode submit region end(Prohibit modification and deletion)
