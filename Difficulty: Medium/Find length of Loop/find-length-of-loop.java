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
    public int lengthOfLoop(Node head) {
        // code here
        Node i=head;
        Node j=head;
        // int count=0;
        while(j!=null&& j.next != null){
            i=i.next;
            j=j.next.next;
            if(i==j){
                int count=1;
                Node temp=i.next;
                while(temp!=i){
                    count++;
                    temp=temp.next;
                }
                return count;

            }
        }
        return 0;


    }
}