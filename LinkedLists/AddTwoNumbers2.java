package LinkedLists;

import java.util.Stack;

public class AddTwoNumbers2 {
    public static void main(String[] args) {
        ListNode x = new ListNode(7);
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(4);
        ListNode c = new ListNode(3);
        x.next = a;
        a.next = b;
        b.next = c;
        c.next = null;

        ListNode d = new ListNode(5);
        ListNode e = new ListNode(6);
        ListNode f = new ListNode(4);
        d.next = e;
        e.next = f;
        f.next = null;

        ListNode ans = AddTwoNumbers2.solution(x, d);
        while(ans != null){
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
    public static ListNode solution(ListNode l1,ListNode l2){
        Stack<Integer> a = new Stack<>();
        Stack<Integer> b = new Stack<>();
        
        while(l1 != null){
            a.push(l1.val);
            l1 = l1.next;
        }
        
        while(l2 != null){
            b.push(l2.val);
            l2 = l2.next;
        }
            
        int carry = 0;
        ListNode dummy = new ListNode(0);
        while(!a.empty() && !b.empty()){
            int sum = a.pop() + b.pop() + carry;
            carry = sum / 10;
            ListNode node = new ListNode(sum % 10);
            node.next = dummy.next;
            dummy.next = node;
        }
                   
        while(!a.empty()){
            int sum = a.pop() + carry;
            carry = sum / 10;
            ListNode node = new ListNode(sum % 10);
            node.next = dummy.next;
            dummy.next = node;
        }
                   
        while(!b.empty()){
            int sum = b.pop() + carry;
            carry = sum / 10;
            ListNode node = new ListNode(sum % 10);
            node.next = dummy.next;
            dummy.next = node;
        }
        if(carry != 0){
            ListNode node = new ListNode(carry);
            node.next = dummy.next;
            dummy.next = node;
        }
        return dummy.next;
    }
    
}
