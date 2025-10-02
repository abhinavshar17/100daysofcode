class Node {
    int val;
    int min;

    // constructor banya
    public Node(int val, int min) {
        this.val = val;
        this.min = min;
    }
}

class MinStack {
    Stack<Node> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(new Node(val, val));
            return;
        }
        int minTop = stack.peek().min;

        if (val < minTop) {
            stack.push(new Node(val, val));
            return;
        } else {
            stack.push(new Node(val, minTop));
        }
    }

    public void pop() {
        if (stack.isEmpty()) {
            return;
        }
        stack.pop();
    }

    public int top() {
        if (stack.isEmpty()) {
            return -1;
        }
        Node nodeTop = stack.peek();
        return nodeTop.val;
    }

    public int getMin() {
        if (stack.isEmpty()) {
            return -1;
        }
        Node nodeTop = stack.peek();
        return nodeTop.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */