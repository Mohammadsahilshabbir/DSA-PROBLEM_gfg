/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(root==null) return result;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            int size=q.size();
            ArrayList<Integer> level = new ArrayList<>();
            
            for (int i = 0; i < size; i++) {
                Node curr = q.poll();
                level.add(curr.data);
                
                if (curr.left != null)
                    q.add(curr.left);
                
                if (curr.right != null)
                    q.add(curr.right);
            }
            
            result.add(level);
        }
        return result;
    }
}