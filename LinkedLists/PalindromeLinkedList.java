package LinkedLists;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        ListNode x = new ListNode(1);
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(1);
        x.next = a;
        a.next = b;
        b.next = c;
        c.next = null;

        System.out.println(PalindromeLinkedList.solution(x));
    }
    public static ListNode rList(ListNode head){
        ListNode prev = null;
        while(head != null){
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
    public static boolean solution(ListNode head){
        if(head.next == null) return true;
       ListNode slow = head,fast = head,prev = null;
        while(fast != null && fast.next != null)
        {   prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        ListNode rhead = rList(slow);
        prev = head;
        while(prev != null && rhead != null){
            if(prev.val != rhead.val) return false;
            prev = prev.next;
            rhead = rhead.next;
        }
        
        
        return true;
    }
}
