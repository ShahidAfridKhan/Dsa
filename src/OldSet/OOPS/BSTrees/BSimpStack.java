package OldSet.OOPS.BSTrees;
import java.util.Stack;
import java.util.*;
public class BSimpStack {
    public static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;


        TreeNode(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static List<Integer> PreTraversal(TreeNode root){
        List<Integer> preorder = new ArrayList<Integer>();
        if(root == null) return preorder;

        Stack<TreeNode> st = new Stack<TreeNode>();
        st.push(root);

        while(!st.isEmpty()){
            root = st.pop();

            preorder.add(root.data);

            if(root.right!=null){
                st.push(root.right);
            }
            if(root.left!=null){
                st.push(root.left);
            }
        }
        return preorder;
    }

    public static void main(String[] args) {
        List<Integer> Preorder=new ArrayList<Integer>();

        Stack<Integer> st=new Stack<Integer>();

        TreeNode root=new TreeNode(1);

        root.left=new TreeNode(2);
        root.right=new TreeNode(7);

        root.left.left=new TreeNode(3);
        root.left.right=new TreeNode(4);

        root.left.right.left=new TreeNode(5);
        root.left.right.right=new TreeNode(6);

        List<Integer> preorder= PreTraversal(root);

        System.out.println(preorder);


    }
}
