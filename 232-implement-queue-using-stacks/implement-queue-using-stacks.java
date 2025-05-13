class MyQueue {

    private final Deque<Integer> front;
    private final Deque<Integer> back; 

    public MyQueue() {
        this.front = new ArrayDeque<>();
        this.back = new ArrayDeque<>();
    }
    
    public void push(int x) {
        back.addLast(x);
    }
    
    public int pop() {
        if (front.isEmpty()) {
            flushBack();
        }
        return front.removeLast();
    }
    
    public int peek() {
        if (front.isEmpty()) {
            flushBack();
        }
        return front.getLast();
    }

    private void flushBack() {
        while (!back.isEmpty()) {
            front.addLast(back.removeLast());
        }
    }
    
    public boolean empty() {
        return front.isEmpty() && back.isEmpty(); 
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */



/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
