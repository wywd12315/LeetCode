package linkedList;

public class ReverseLinkedList_Rec {
    public ListNode reverseList(ListNode head) {
        if((head==null)||(head.next==null)) return head;
        ListNode tmp= new ListNode(head.val);
        head = reverseList(head.next);
        ListNode i = head;
        while(i.next!=null) i=i.next;
        i.next=tmp;
        return head;
    }
}
