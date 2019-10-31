package tree;

import java.util.Stack;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack= new Stack<TreeNode>();
        List<Integer> res = new ArrayList<Integer>();
        TreeNode temp = root;
        while(temp!=null||!stack.isEmpty()) {
        	while(temp!=null) {
        		stack.push(temp);
        		temp=temp.left;
        	}
        	if(!stack.isEmpty()) {
        		temp=stack.pop();
        		res.add(temp.val);
        		temp=temp.right;
        	}
        }
        return res;
    }
}
