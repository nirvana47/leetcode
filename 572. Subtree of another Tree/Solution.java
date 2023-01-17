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
  // THE NAMING STANDARD IS INCORRECT, BUT IF YOU CHANGE IT TO isSubTree (IT IS isSubtree BY LEETCODE) 
  // THEN YOU WILL START GETTING COMPILE ERRORS. SO DON'T.
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
  
      // BASE CASE #1: ARE BOTH THE TREES NULL?
      if (root == null && subRoot == null)
            return true;
      // BASE CASE #2: IS ONE NULL BUT THE OTHER IS NOT? DOES NOT MATCH THEN
      // HOWEVER 1 CAVEAT: IF SUBROOT IS NULL, AND ROOT IS NOT NULL, THEN SUBROOT SHOULD TECHNICALLY
      // BE A SUBTREE OF ROOT. SO... THIS SHOULD NOT WORK? WHAT THE HELL... WHY DOES IT WORK?
      else if (root == null || subRoot == null)
            return false;
      // BASE CASE #3: ARE BOTH THE TREES THE SAME? IF YES, RETURN TRUE.
      else if (isSameTree(root, subRoot))
            return true;
      
      // LET THE RECURSION BEGIN: WE GO LEFT AND RIGHT AND START COMPARING THAT SUBTREE TO THE SUBTREE
      // IF THERE IS A MATCH-UP ANYWHERE, WE ARE GOOD! 
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

  // THIS CODE IS SAME AS SAME-TREE PROBLEM ON LEETCODE. GOT TO RE-USE :)
    public boolean isSameTree(TreeNode root, TreeNode subRoot) {    
        if (root == null && subRoot == null)
            return true;
        else if (root == null || subRoot == null)
            return false;
        else if (root.val != subRoot.val)
            return false;

        return isSameTree(root.left, subRoot.left) && isSameTree(root.right, subRoot.right);
    }
}
