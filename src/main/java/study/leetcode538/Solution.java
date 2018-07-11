package study.leetcode538;

/**
 * Given a Binary Search Tree (BST), convert it to a Greater Tree such that every key of
 * the original BST is changed to the original key plus sum of all keys greater than
 * the original key in BST.
 *
 * @see <a href="https://leetcode.com/problems/convert-bst-to-greater-tree/description/">
 * Convert BST to Greater Tree</a>
 */
public class Solution {

    int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        if (root == null) {
            return null;
        }
        convertBST(root.right);
        root.val += sum;
        sum = root.val;
        convertBST(root.left);
        return root;
    }
}