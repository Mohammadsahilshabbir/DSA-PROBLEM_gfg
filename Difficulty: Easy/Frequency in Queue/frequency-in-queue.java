class Geeks {
    static void enqueue(Queue<Integer> q, int k) {
        //  code here
        q.add(k);

    }

    static int findFrequency(Queue<Integer> q, int k) {
    
        int count = 0;
        // iterate through queue
        for (int ele : q) {
            if (ele == k) {
                count++;
            }
        }
        return count;

        //  code here
    }
}