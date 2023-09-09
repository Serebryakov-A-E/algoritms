package AlgorithmicpProblems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MyStack {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;
    private int top;
    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        queue2.offer(x);
        top = x;

        // Move all elements from queue1 to queue2
        while (!queue1.isEmpty()) {
            queue2.offer(queue1.poll());
        }

        // Swap queue1 and queue2 to keep queue1 empty
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    public int pop() {
        int popped = queue1.poll();

        // If there is another element, update 'top'
        if (!queue1.isEmpty()) {
            top = queue1.peek();
        }

        return popped;
    }

    public int top() {
        return top;
    }

    public boolean empty() {
        return queue1.isEmpty();
    }
}
