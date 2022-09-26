package LinkedLists;
class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val) { this.val = val; }
}
public class AddTwoNumbers{
    public static void main(String[] args) {
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(4);
        ListNode c = new ListNode(3);
        a.next = b;
        b.next = c;
        c.next = null;

        ListNode d = new ListNode(5);
        ListNode e = new ListNode(6);
        ListNode f = new ListNode(4);
        d.next = e;
        e.next = f;
        f.next = null;

        ListNode ans = AddTwoNumbers.solution(a, d);
        while(ans != null){
            System.out.println(ans.val);
            ans = ans.next;
        }

    }

    public static ListNode solution(ListNode l1,ListNode l2){
        int carry = 0;
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        while(l1 != null && l2 != null){
            int sum = l1.val + l2.val + carry;
            carry = sum / 10;
            ListNode node = new ListNode(sum%10);
            head.next = node;
            head = head.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null){
            int sum = l1.val + carry;
            carry = sum / 10;
            ListNode node = new ListNode(sum%10);
            head.next = node;
            head = head.next;
            l1 = l1.next;
        }
        while(l2 != null){
            int sum = l2.val + carry;
            carry = sum / 10;
            ListNode node = new ListNode(sum%10);
            head.next = node;
            head = head.next;
            l2 = l2.next;
        }
        if(carry != 0){
            head.next = new ListNode(carry);
        }
        return dummy.next;
    }

}