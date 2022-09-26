package LinkedLists;

public class Intersection {
    public static void main(String[] args) {
        ListNode x = new ListNode(7);
        ListNode a = new ListNode(2);
        ListNode d = new ListNode(5);
        ListNode e = new ListNode(6);
        ListNode f = new ListNode(4);
        x.next = a;
        a.next = e;
        d.next = e;
        e.next = f;
        f.next = null;
        ListNode node = Intersection.solution(x, d);
        System.out.println(node.val);
    }
    public static ListNode solution(ListNode headA,ListNode headB){
        int c1 = 0,c2 = 0;
        ListNode a = headA,b = headB;
        while(headA != null){
            c1 += 1;
            headA = headA.next;
        }
        
        while(headB != null){
            c2 += 1;
            headB = headB.next;
        }
        int diff = Math.abs(c1 - c2);
        if(c2 > c1){
            headA = b;
            headB = a;
        }
        else{
            headA = a;
            headB = b;
        }
        
        while(diff != 0){
            headA = headA.next;
            diff -= 1;
        }
        
        while(headA != null || headB != null){
            if(headA == headB) return headA;
            headA = headA.next;
            headB = headB.next;
        }
        
        return null;
    }
}
