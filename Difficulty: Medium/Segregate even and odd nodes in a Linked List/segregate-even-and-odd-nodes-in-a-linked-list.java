// User function Template for Java

/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node divide(Node head) {
        // code here
        Node edm=new Node(-1);
        Node odm=new Node(-1);
        Node temp=head;
        Node t1=edm;
        Node t2=odm;
        while(temp!=null){
            if(temp.data%2==0){
                t1.next=temp;
                t1=t1.next;
            }else{
                t2.next=temp;
                t2=t2.next;
            }
            temp=temp.next;
        }
        t2.next=null;
        t1.next=odm.next;
        return edm.next;
    }
}