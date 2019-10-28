import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementI {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack=new Stack<>();
        HashMap<Integer,Integer> map= new HashMap<>();
        int[] result=new int[nums1.length];
        //找到下一个最大元素|建立映射关系
        for(int x:nums2) {
        	while(!stack.empty()&&stack.peek()<x){
        	map.put(stack.pop(),x);
        	}
        	stack.push(x);
        }
        
        //栈中剩余的内容是没有下一个最大元素的|将他们的值置定为题目的要求-1
        while(!stack.isEmpty()) {
        	map.put(stack.pop(), -1);
        }
        //根据映射关系计算结果
        for(int i=0;i<nums1.length;i++) {
        	result[i]=map.get(nums1[i]);
        }
        return result;
    }
    
}
