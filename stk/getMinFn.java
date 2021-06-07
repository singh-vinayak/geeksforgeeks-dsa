//design a stack that supports getMin function in o(1) time complexity..

//here, we use another stack. therefore, requiring o(n) auxillary space

//import java.io.*;
import java.util.*;

class MyStack {

    Stack<Integer> ms;
    Stack<Integer> as;

    MyStack() {
        ms = new Stack<>();
        as = new Stack<>();
    }

    void push(int x) {

        if (ms.isEmpty()) {
            ms.add(x);
            as.add(x);
            return;
        }

        ms.add(x);

        if (as.peek() >= ms.peek())
            as.add(x);
    }

    void pop() {

        if (as.peek() == ms.peek())
            as.pop();
        ms.pop();

    }

    int top() {
        return ms.peek();
    }

    int getMin() {
        return as.peek();
    }
}

class getMinFn {

    public static void main(String[] args) {
        MyStack s = new MyStack();
        ;
        s.push(4);
        s.push(5);
        s.push(8);
        s.push(1);
        s.pop();

        System.out.print(" Minimum Element from Stack: " + s.getMin());

    }
}
