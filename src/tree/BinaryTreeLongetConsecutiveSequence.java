package tree;

public class BinaryTreeLongetConsecutiveSequence {
	int res;
    public int longestConsecutive(TreeNode root) {
        if(root==null) return 0;
        res = 0;
        dfs(root,root.val,0);
        return res;
    }
    public void dfs(TreeNode root, int v, int out) {
    	if(root==null) return;
    	if(root.val == v+1) out++;
    	else out = 1;
    	res = res>out?res:out;
    	dfs(root.left,root.val,out);
    	dfs(root.right,root.val,out);
    }
}

