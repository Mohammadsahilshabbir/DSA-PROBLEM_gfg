class myStack {
    // Define your stack
    private ArrayList<Integer> stack;

    // Constructor
    public myStack() {
        stack = new ArrayList<>();
    }

    public void push(int x) {
        // insert x into stack
        stack.add(x);
    }

    public void pop() {
        // remove top ele from stack
        if (!stack.isEmpty()) {
            stack.remove(stack.size() - 1);
        }
    }

    public int peek() {
        // return top of stack
         if (!stack.isEmpty()) {
            return stack.get(stack.size() - 1);
        }
        return -1;  // or throw exception
    }

    public int getSize() {
        // return current size of stack
         return stack.size();
    }

    public boolean isEmpty() {
        // check whether stack is empty
        return stack.isEmpty();
    }
}
