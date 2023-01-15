/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}  val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        // INCORRECT INPUT
        if (root == null)
            return root;

        // LEAF NODE
        if (root.left == null && root.right == null)
            return root;

        // GO DOWN THE LEFT SIDE
        invertTree(root.left);
        
        // THEN GO DOWN THE RIGHT SIDE
        invertTree(root.right);

        // ONCE LEFT & RIGHT ARE DONE, SWAP LEFT AND RIGHT
        // LEFT/RIGHT MAY BE NULL SO IT IS NOT ENOUGH TO SWAMP VALUES ONLY
        // NEED TO CHANGE THE POINTER TO LEFT AND RIGHT 
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        return root;
    }
}
