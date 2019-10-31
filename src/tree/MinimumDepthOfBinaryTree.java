package tree;

public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        if((root.left==null)&&(root.right==null)) {return 1;}
        else {
        	int a=Integer.MAX_VALUE,b=Integer.MAX_VALUE;
        	if(root.left!=null) {a=minDepth(root.left);}
        	if(root.right!=null) {b=minDepth(root.right);}
        	return a<b?a+1:b+1;
        }
    }
}
