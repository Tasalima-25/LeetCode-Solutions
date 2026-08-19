/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> ans = new ArrayList<>();

        preorder(root, ans);

        return ans;
    }

    public void preorder(TreeNode root, List<Integer> ans) {

        // Tree empty hai
        if (root == null) {
            return;
        }

        // 1. Root
        ans.add(root.val);

        // 2. Left
        preorder(root.left, ans);

        // 3. Right
        preorder(root.right, ans);
    }
}