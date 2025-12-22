/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node swapKth(Node head, int k) {
        // code here
        if(head==null) return null;
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=k;i++){
            if(fast==null) return head;
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
       fast=head;
        for(int i=1;i<=k-1;i++){
            fast=fast.next;
        }
        int temp=fast.data;
        fast.data=slow.data;
        slow.data=temp;
        return head;
    }
}
