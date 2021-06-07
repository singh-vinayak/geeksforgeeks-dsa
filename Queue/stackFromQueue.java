//stack can be implemented using 2 queue
/**
 * enqueue(q,x)-
 * if queue is not empty,then
 *      push x to q2
 *      push everything from q1 to q2.
 *      swap q1 and q2.
 *      
 *      o(n) time complexity
 * 
 * dequeue(q)
 *  if queue empty, error.
 *  else pop the top most element out.
 * 
 *  o(1) time complexity. 
 * 
 * 
 */

// IMPORTANT- BELOW

// Java program to implement Stack using
// two queues with costly enQueue()


import java.util.*;

public class stackFromQueue {


    static class Stack {

        static Queue<Integer> q1 = new LinkedList<Integer>();
        // static Queue<Integer> q2 = new LinkedList<Integer>();
        static Queue<Integer> q2 = new ArrayDeque<Integer>();

        static int curr_size;

        Stack() {
            curr_size = 0;
        }

        static void push(int x) {
            curr_size++;

            q2.add(x);

            while (!q1.isEmpty()) {
                q2.add(q1.peek());
                q1.remove();
            }

            Queue<Integer> q = q1;
            q1 = q2;
            q2 = q;
        }

        static void pop() {

            if (q1.isEmpty())
                return;
            q1.remove();
            curr_size--;
        }

        static int top() {
            if (q1.isEmpty())
                return -1;
            return q1.peek();
        }

        static int size() {
            return curr_size;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(5);
        s.push(15);
        s.push(20);

        System.out.println("current size: " + s.size());
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());

        System.out.println("current size: " + s.size());
    }
}

