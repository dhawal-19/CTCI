package LinkedLists;

public class LinkedListCycle {
    public static void main(String[] args) {
        ListNode x = new ListNode(7);
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(4);
        ListNode c = new ListNode(3);
        x.next = a;
        a.next = b;
        b.next = c;
        c.next = a;
        System.out.println(LinkedListCycle.solution(x));
    }
    public static boolean solution(ListNode head){
        ListNode slow = head,fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }
}
