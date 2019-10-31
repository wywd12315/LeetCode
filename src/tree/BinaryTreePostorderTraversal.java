package tree;
import java.util.Stack;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        Stack<Integer> nodeState=new Stack<>();//��¼�ҽڵ��Ƿ��Ѿ����ʹ���1��ʾ�Ѿ������ˣ�0��ʾδ����
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
        	}//�����ѭ��������ʱ��  ˵��stackջ�����Ǹ��ڵ�û����ڵ�

			 if(nodeState.peek()==1)//�����ʱ���Ѿ����ʹ��ҽڵ���  ��ʱ��Ϳ��Է��ʸ��ڵ�
			 {
				 res.add(stack.pop().val);
				 nodeState.pop();//�Ѹ��ڵ��Ӧ��״ֵ̬ȥ��
				 
			 }

			 else {//�����ҽڵ�
				temp=stack.peek().right;
				nodeState.pop();//����״ֵ̬ ��0��1  
				nodeState.push(1);
			}
        }
        return res;
    }
}
