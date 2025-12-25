class myQueue {
    private LinkedList<Integer> data;
    // Initialize your data members
    public myQueue() {
        data = new LinkedList<>();
    }
    void enqueue(int x) {
        // Implement enqueue operation
        data.addLast(x);
    }

    void dequeue() {
        // Implement dequeue operation
        if (!data.isEmpty()) {
            data.removeFirst();
        } 
        // else {
        //     System.out.println("Queue is empty, cannot dequeue!");
        // }

    }

    int front() {
        // Implement front operation
        if (data.isEmpty()) return -1;
            return data.getFirst();
        

    }

    int size() {
        // Implement size operation
        return data.size();

    }
}
