/*
Structure of node class is:
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public Node insertInMiddle(Node head, int x) {
        // Code here;
        if(head==null||head.next==null)  return new Node(x);;
        Node slow=head;
        Node fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node insrt=new Node(x);
        insrt.next=slow.next;
        slow.next=insrt;
        return head;
        
    }
}