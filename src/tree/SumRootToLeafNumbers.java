package tree;

public class SumRootToLeafNumbers {
	    public int sumNumbers(TreeNode root) {
	        if(root==null) return 0;
	        int[] nums = new int[1];     //����sum��ֵ,
	        build(nums,root,0);
	        return nums[0];
	    }

	    public void build(int[] sum,TreeNode node,int temp){
	        int count = temp;
	        if(node.left==null&&node.right==null){      //Ҷ�ӽڵ����ֵ
	            sum[0] += count*10+node.val;
	            return;
	        }
	        count = count*10+node.val;        //��¼ÿ����Ҷ�ӽڵ��ֵ
	        if(node.left!=null){
	            build(sum,node.left,count);
	        }
	        if(node.right!=null){
	            build(sum,node.right,count);
	        }
	    }
}
