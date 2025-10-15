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
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;

        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {

            // Found the node to delete
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;

            // Two children case
            TreeNode temp = findMin(root.right); //righ subtree mein sbse smaller node
            root.val = temp.val;  //connect
            root.right = deleteNode(root.right, temp.val); // delete successor
        }
        return root;
    }
//find min sbse choti node so it must be found in left sidee:
    private TreeNode findMin(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
}
