/*
class Node {
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
};
*/

class Solution {
    public int cycleStart(Node head) {
        // code here
        Node slow=head;
        Node fast=head;
            if(fast==null) return -1;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                Node temp=head;
                while(slow!=temp){
                    slow=slow.next;
                    temp=temp.next;
                }
                return slow.data;
            }
        }
        return -1;
    }
}