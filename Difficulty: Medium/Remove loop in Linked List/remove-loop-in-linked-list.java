/*
class Node
{
    int data;
    Node next;
}
*/

class Solution {
    public static void removeLoop(Node head) {
        // code here
        if (head == null || head.next == null) return;
        Node i=head;
        Node j=head;
        while(j!=null&& j.next != null){
            i=i.next;
            j=j.next.next;
            if(i==j){
                break;
                }
            }
            if (i != j) return;

            i=head;
            while(i!=j){
                i=i.next;
                j=j.next;
            }
        Node ptr = i;
        while (ptr.next != i) {
            ptr = ptr.next;
        }
        ptr.next = null;
    }
}