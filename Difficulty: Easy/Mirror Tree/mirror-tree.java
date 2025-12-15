/*
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Solution {
    void mirror(Node root) {
        // code here
        if(root==null) return;
        swap(root);
        mirror(root.left);
        mirror(root.right);
    }
    void swap(Node root){
        Node temp=root.left;
        root.left=root.right;
        root.right=temp;
        
    }
}