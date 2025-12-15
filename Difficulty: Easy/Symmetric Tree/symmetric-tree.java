/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    public boolean isSymmetric(Node root) {
        // code here
        if(root==null) return true;
        return helper(root.left,root.right);
        
    }
    public boolean helper(Node t1,Node t2){
        if(t1==null&&t2==null) return true;
        if(t1==null||t2==null) return false;
        return (t1.data==t2.data)&& helper(t1.left,t2.right)&& helper(t1.right,t2.left);
    }
}


