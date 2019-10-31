package tree;
import java.util.Stack;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        Stack<Integer> nodeState=new Stack<>();//记录右节点是否已经访问过，1表示已经访问了，0表示未访问
        List<Integer> res = new ArrayList<Integer>();
        TreeNode temp = root;

		 if(temp==null)
			 return res;
		 else {
			stack.push(temp);
			nodeState.push(0);
			temp=temp.left;
		}
		
		 
        while(!stack.isEmpty()) {
        	while(temp!=null) {
        		stack.push(temp);
        		nodeState.push(0);
        		temp=temp.left;
        	}//当这个循环跳出的时候  说明stack栈顶的那个节点没有左节点

			 if(nodeState.peek()==1)//如果这时候已经访问过右节点了  这时候就可以访问根节点
			 {
				 res.add(stack.pop().val);
				 nodeState.pop();//把根节点对应的状态值去除
				 
			 }

			 else {//访问右节点
				temp=stack.peek().right;
				nodeState.pop();//更改状态值 由0变1  
				nodeState.push(1);
			}
        }
        return res;
    }
}
