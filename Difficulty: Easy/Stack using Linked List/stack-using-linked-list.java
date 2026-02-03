// Node class
/* class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
} */

// Stack class
class myStack {
    LinkedList<Integer>ans=new LinkedList<>();
    public myStack() {
        // Initialize your data members
        // LinkedList<Integer>ans=new LinkedList<>();
    }

    public boolean isEmpty() {
        // check if the stack is empty
        return ans.isEmpty();
    }

    public void push(int x) {
        // Adds an element x at the rear of the stack.
        ans.push(x);
    }

    public void pop() {
        // Removes the front element of the stack.
        ans.pop();
    }

    public int peek() {
        // Returns the front element of the stack.
        // If stack is empty, return -1.
        if(ans.isEmpty()) return -1;
        return ans.peek();
    }

    public int size() {
        // Returns the current size of the stack.
        return ans.size();
    }
}
