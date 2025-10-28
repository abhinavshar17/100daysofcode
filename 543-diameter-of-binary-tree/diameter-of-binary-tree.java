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
    public int diameterOfBinaryTree(TreeNode root) {
            if(root==null){
                return 0;
            }

            int leftdia=diameterOfBinaryTree(root.left);
            int leftht=height(root.left);
            int rightdia=diameterOfBinaryTree(root.right);
            int rightht=height(root.right);

            int selectheight=leftht+rightht;

            return Math.max( Math.max(leftdia,rightdia),selectheight);
    }

    public int height(TreeNode node){
        if(node==null){
            return 0;      
        }
        int lh=height(node.left);
        int rh=height(node.right);
        return Math.max(lh,rh)+1;
    }
}