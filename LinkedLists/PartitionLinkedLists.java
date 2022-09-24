package LinkedLists;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class PartitionLinkedLists {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(5);
        Node f = new Node(2);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = null;
        Node head =  PartitionLinkedLists.solution(a,3);
        while(head != null){
            System.out.print(head.data + "\t");
            head = head.next;
        }
    }

    public static Node solution(Node head, int x) {
        Node bdummy = new Node(0);
        Node bhead = bdummy;
        Node adummy = new Node(0);
        Node ahead = adummy;

        while (head != null) {
            if (head.data < x) {
                bhead.next = head;
                bhead = bhead.next;
            } else {
                ahead.next = head;
                ahead = ahead.next;
            }

            head = head.next;
        }

        ahead.next = null;
        bhead.next = adummy.next;

        return bdummy.next;
    }
}
