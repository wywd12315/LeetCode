package tree;
import java.util.Stack;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> res = new ArrayList<Integer>();
        stack.push(root);
        while(!stack.isEmpty()) {
        	TreeNode temp= stack.pop();
        	if(temp!=null) {
        		res.add(temp.val);
        		stack.add(temp.right);
        		stack.add(temp.left);
        	}
        }
        return res;
    }
}
