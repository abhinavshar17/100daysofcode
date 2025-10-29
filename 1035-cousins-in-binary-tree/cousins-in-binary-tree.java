class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) return false;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            int cc = 0; 

            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                int pc = 0;

                // check siblings condition
                if (curr.left != null && curr.right != null) {
                    if ((curr.left.val == x && curr.right.val == y) ||
                        (curr.left.val == y && curr.right.val == x)) {
                        return false; // same parent -> not cousins
                    }
                }

                if (curr.left != null) {
                    q.add(curr.left);
                    if (curr.left.val == x || curr.left.val == y) {
                        pc++;
                        cc++;
                    }
                }

                if (curr.right != null) {
                    q.add(curr.right);
                    if (curr.right.val == x || curr.right.val == y) {
                        pc++;
                        cc++;
                    }
                }
            }

            if (cc == 2) return true;   // both found same level diff parents
            if (cc == 1) return false;  // one found only
        }
        return false;
    }
}
