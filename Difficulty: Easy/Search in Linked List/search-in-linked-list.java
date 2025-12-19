/*
  class Node {
   int data;
    Node next;

    Node(int d)  { data = d;  next = null; }
}
*/
class Solution {
    public boolean searchKey(Node head, int key) {
        Node current = head;
        // Code here
        while (current != null) {
            // Check if current node's data matches the key
            if (current.data == key) {
                return true;  // Key found
            }
            current = current.next;  // Move to next node
        }
        
        // If we reach here, key was not found
        return false;

    }
}