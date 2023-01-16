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
    public int maxDepth(TreeNode root) {
        // BASE CASE #1: IF THERE IS NO NODE
        if (root == null)
            return 0;
        
        // BASE CASE #2: LEAF NODE OR A ROOT NODE WITH NOT LEFT/RIGHT CHILDREN NODES
        if (root.left == null && root.right == null)
            return 1;

        // CREATING A VARIABLE; CAN PROBABLY DO IT WITHOUT IT TOO BUT I WANT TO MAKE MY CODE
        // EASILY UNDERSTANDABLE AND READABLE. 
        int height = 0;

        // YOU RECURSE THROUGH THE LEFT AND RIGHT TREES/NODES AND KEEP ADDING 1 TO IT. 
        // AT FIRST I WAS CONFUSED IF I SHOULD DO 'HEIGHT +=' INSTEAD OF 'HEIGHT =' BUT THEN
        // I DID A PAPER RUN AND REALIZED THIS IS THE WAY TO GO. WHICH IS WHY MAYBE YOU CAN
        // WRITE THIS CODE WITHOUT CREATING A VARIABLE AND TAKING MEMORY
        height = Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;

        return height;
    }
}
