//iterative solution - using stack
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseQ {

    static Queue<Integer> queue;

    static void Print() {
        for (Integer x : queue)
            System.out.print(x + " ");
    }

    static void reversequeue() {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.add(queue.peek());
            queue.remove();
        }
        while (!stack.isEmpty()) {
            queue.add(stack.peek());
            stack.pop();
        }
    }

    public static void main(String args[]) {
        queue = new LinkedList<Integer>();
        queue.add(12);
        queue.add(5);
        queue.add(15);
        queue.add(20);

        reversequeue();
        Print();
    }
}


//recursive



// import java.util.LinkedList;
// import java.util.*;

// public class GfG {

//     static void Print(Queue<Integer> q) {
//         for (Integer x : q)
//             System.out.print(x + " ");
//     }

//     static void reverse(Queue<Integer> q) {
//         if (q.isEmpty())
//             return;

//         int x = q.peek();
//         q.remove();

//         reverse(q);
//         q.add(x);

//     }

//     public static void main(String args[]) {
//         Queue<Integer> queue = new LinkedList<Integer>();
//         queue.add(12);
//         queue.add(5);
//         queue.add(15);
//         queue.add(20);

//         reverse(queue);
//         Print(queue);
//     }
// }
