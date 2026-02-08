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
    public Node sortedArrayToBST(int[] arr) {
        // code here
        return buildBST(arr, 0, arr.length - 1);
    }

    private Node buildBST(int[] arr, int start, int end) {
       
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;

        Node root = new Node(arr[mid]);

        root.left = buildBST(arr, start, mid - 1);
        root.right = buildBST(arr, mid + 1, end);

        return root;

    }
}