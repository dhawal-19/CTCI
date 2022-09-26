package LinkedLists;

public class LinkedListCycle2 {
    public static void main(String[] args) {
        ListNode x = new ListNode(7);
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(4);
        ListNode c = new ListNode(3);
        x.next = a;
        a.next = b;
        b.next = c;
        c.next = x;
        System.out.println(LinkedListCycle2.solution(x).val);
    }
    public static ListNode solution(ListNode head){
        if(head == null || head.next == null) return null;
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                break;
        }
        fast = head;
        while(slow != null && fast != null && slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        if(slow == fast) return slow;
        return null;
    }
}
