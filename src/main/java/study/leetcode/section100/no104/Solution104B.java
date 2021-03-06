package study.leetcode.section100.no104;

import study.leetcode.common.TreeNode;

/**
 * <h2>Maximum Depth of Binary Tree</h2>
 * Given a binary tree, find its maximum depth.
 * <p>
 * The maximum depth is the number of nodes along the longest path from
 * the root node down to the farthest leaf node.
 * <p>
 * Note: A leaf is a node with no children.
 *
 * @see <a href="https://leetcode.com/problems/maximum-depth-of-binary-tree/description/">
 * Maximum Depth of Binary Tree - LeetCode</a>
 */
public class Solution104B {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return left >= right ? left + 1 : right + 1;
    }
}
