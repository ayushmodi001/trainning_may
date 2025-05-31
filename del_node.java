import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

public class del_node {

    static TreeNode insert(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        if (val < root.val) root.left = insert(root.left, val);
        else root.right = insert(root.right, val);
        return root;
    }

    static TreeNode delete(TreeNode root, int key) {
        if (root == null) return null;
        if (key < root.val) root.left = delete(root.left, key);
        else if (key > root.val) root.right = delete(root.right, key);
        else {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;
            TreeNode min = root.right;
            while (min.left != null) min = min.left;
            root.val = min.val;
            root.right = delete(root.right, min.val);
        }
        return root;
    }

    static void levelOrder(TreeNode root) {
        if (root == null) {
            System.out.println("[Empty]");
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int n = q.size();
            while (n-- > 0) {
                TreeNode node = q.poll();
                System.out.print(node.val + " ");
                if (node.right != null) q.add(node.right);
                if (node.left != null) q.add(node.left);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] values = {34, 12, 56, 78, 3, 2, 6, 79, 69, 11, 46, 23};
        TreeNode root = null;
        for (int val : values) root = insert(root, val);

        while (root != null) {
            System.out.println("\nTree:");
            levelOrder(root);
            System.out.print("Enter value to delete: ");
            int key = sc.nextInt();
            root = delete(root, key);
        }
    }
}