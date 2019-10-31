package tree;
import java.util.Queue;
import java.util.LinkedList;
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        //加入根节点
        q.offer(root);
        while(!q.isEmpty()) {
        	TreeNode temp = q.poll();
        	TreeNode cur = temp.left;
        	temp.left = temp.right;
        	temp.right = cur;
        	if(temp.left!=null)
        		q.offer(temp.left);
        	if(temp.right!=null)
        		q.offer(temp.right);
        }
        return root;
    }
}
