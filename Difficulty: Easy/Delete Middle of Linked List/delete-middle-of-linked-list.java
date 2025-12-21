/*
class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        if (head == null || head.next == null) {
            return null;
        }


        int len=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        temp=head;
        if(head==null||head.next==null) return null;
        for(int i=1;i<len/2;i++){
            temp=temp.next;
        }
            temp.next=temp.next.next;
        return head;
    }
}