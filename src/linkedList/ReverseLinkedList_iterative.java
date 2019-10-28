package linkedList;

public class ReverseLinkedList_iterative {
    public ListNode reverseList(ListNode head) {
    	if((head==null)||(head.next==null)) return head;
    	
    	ListNode pre=head;
    	ListNode cur=head.next;
    	
    	while(cur!=null) {
    		pre.next=cur.next;
    		cur.next=head;
    		head=cur;
    		cur=pre.next;
    	}
    	return head;
    }
}
