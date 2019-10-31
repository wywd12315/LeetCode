package tree;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(q==null&&p==null) return true;
        if(q!=null&&p!=null) {
        	if(q.val!=p.val) return false;
        	else return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        }return false;
    }
}
