package OldSet.OOPS.BSTrees;

public class Implementation {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static TreeNode root;

    public static void preorder(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void Inorder(TreeNode root){
        if(root==null) return;

        Inorder(root.left);
        System.out.println(root.val+" ");
        Inorder(root.right);
    }
    public static void postOrder(TreeNode root){
        if(root==null) return;

        postOrder(root.left);

        postOrder(root.right);

        System.out.println(root.val+" ");

    }

    public static void main(String[] args) {

        root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        preorder(root);
    }
}