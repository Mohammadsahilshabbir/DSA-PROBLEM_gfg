/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    int getMiddle(Node head) {
        // code here
        int len=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        temp=head;
        for(int i=1;i<=len/2;i++){
            temp=temp.next;
        }
        return temp.data;
    }
}