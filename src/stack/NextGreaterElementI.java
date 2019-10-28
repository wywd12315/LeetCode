import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementI {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack=new Stack<>();
        HashMap<Integer,Integer> map= new HashMap<>();
        int[] result=new int[nums1.length];
        //�ҵ���һ�����Ԫ��|����ӳ���ϵ
        for(int x:nums2) {
        	while(!stack.empty()&&stack.peek()<x){
        	map.put(stack.pop(),x);
        	}
        	stack.push(x);
        }
        
        //ջ��ʣ���������û����һ�����Ԫ�ص�|�����ǵ�ֵ�ö�Ϊ��Ŀ��Ҫ��-1
        while(!stack.isEmpty()) {
        	map.put(stack.pop(), -1);
        }
        //����ӳ���ϵ������
        for(int i=0;i<nums1.length;i++) {
        	result[i]=map.get(nums1[i]);
        }
        return result;
    }
    
}
