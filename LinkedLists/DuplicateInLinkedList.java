package LinkedLists;

import java.util.HashSet;

class Node {
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}

public class DuplicateInLinkedList {
    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(2);
        Node c = new Node(3);
        c.next = null;
        b.next = c;
        a.next = b;
        Node answer = DuplicateInLinkedList.solution(a);
        while(answer != null){
            System.out.println(answer.data + "\t");
            answer = answer.next;
        }
    }

    public static Node solution(Node head) {
        HashSet<Integer> hs = new HashSet<>();
        Node prev = null, temp = head;
        while (temp != null) {
            if (hs.contains(temp.data)) {
                prev.next = temp.next;
            } else {
                hs.add(temp.data);
                prev = temp;
            }

            temp = temp.next;
        }

        return head;
    }
}
