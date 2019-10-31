package tree;

public class SumRootToLeafNumbers {
	    public int sumNumbers(TreeNode root) {
	        if(root==null) return 0;
	        int[] nums = new int[1];     //保存sum的值,
	        build(nums,root,0);
	        return nums[0];
	    }

	    public void build(int[] sum,TreeNode node,int temp){
	        int count = temp;
	        if(node.left==null&&node.right==null){      //叶子节点计算值
	            sum[0] += count*10+node.val;
	            return;
	        }
	        count = count*10+node.val;        //记录每个非叶子节点的值
	        if(node.left!=null){
	            build(sum,node.left,count);
	        }
	        if(node.right!=null){
	            build(sum,node.right,count);
	        }
	    }
}
