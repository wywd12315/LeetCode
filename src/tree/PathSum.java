package tree;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        	if(root==null){
            	return false;
        	}
        	if(root.left==null&&root.right==null){
            	if(root.val==sum)
                	return true;
            	return false;
        
        	}
        	boolean result = true;
        	result = hasPathSum(root.left,sum-root.val);
        	if(result==true){
            	return result;
        	}
        	result = hasPathSum(root.right,sum-root.val);
        	if(result==true){
            	return result;
        	}
        	return false;
        
    	}
}
