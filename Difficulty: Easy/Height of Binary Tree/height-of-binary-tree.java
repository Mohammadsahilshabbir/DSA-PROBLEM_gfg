/*
class Node {
    int data;
    Node left, right;

    Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public int height(Node root) {
        // code here
        if(root==null){
            return -1;
        }
        // }
        // if(root.left==null){
        //     root.left=root.right;
        // }
        // if(root.right==null){
        //     root.right=root.left;
        // }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight)+1;
    }
}