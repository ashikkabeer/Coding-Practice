package TreeQuestions;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}
public class Main {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(3);
        root1.right = new TreeNode(2);
        root1.left.left = new TreeNode(5);

        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(3);
        root2.left.right = new TreeNode(4);
        root2.right.right = new TreeNode(7);

        // Merge the trees
        TreeNode mergedTree = mergeTrees(root1, root2);
    }
    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        // Base cases
        if (root1 == null) {
            return root2;
        }
        if (root2 == null) {
            return root1;
        }

        // Merge nodes
        TreeNode mergedNode = new TreeNode(root1.val + root2.val);

        // Recursively merge left and right subtrees
        mergedNode.left = mergeTrees(root1.left, root2.left);
        mergedNode.right = mergeTrees(root1.right, root2.right);

        return mergedNode;
    }
}
