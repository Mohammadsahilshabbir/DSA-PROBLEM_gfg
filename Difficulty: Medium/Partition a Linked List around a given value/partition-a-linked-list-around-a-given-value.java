// User function Template for Java

/*class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution {
    public static Node partition(Node node, int x) {
        // Your code here
        Node d1=new Node(0);
        Node d2=new Node(0);
        Node d3=new Node(0);
        Node t1=d1;
        Node t2=d2;
        Node t3=d3;
        Node t=node;
        while(t!=null){
            if(t.data<x){
                t1.next=t;
                t1=t1.next;
            }
            else if (t.data == x) {
                t2.next = t;
                t2 = t2.next;
            }
            else{
                t3.next=t;
                t3=t3.next;
            }
            t=t.next;
        }
            t2.next=d3.next;
            t1.next=d2.next;
            t3.next=null;
            return d1.next;
    }
}