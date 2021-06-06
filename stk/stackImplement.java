//arrays
//import java.io.*;
//import java.util.*;

class stack {
    int arr[];
    int cap;
    int top;

    stack(int c) {
        top = -1;
        cap = c;
        arr = new int[cap];

    }

    void push(int x) {
        if (top == cap - 1) {
            System.out.println("Stack is full");
            return;
        }
        top++;
        arr[top] = x;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return Integer.MIN_VALUE;
        }
        int res = arr[top];
        top--;
        return res;
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return Integer.MIN_VALUE;
        }
        return arr[top];
    }

    int size() {
        return (top + 1);
    }

    boolean isEmpty() {
        return top == -1;
    }
}

class stackImplement {

    public static void main(String[] args) {
        stack s = new stack(5);
        s.push(5);
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
    }
}

//arraylist

// import java.io.*;
// import java.util.*;

// class MyStack {

//     ArrayList<Integer> al = new ArrayList<>();

//     void push(int x) {
//         al.add(x);
//     }

//     int pop() {
//         int res = al.get(al.size() - 1);
//         al.remove(al.size() - 1);
//         return res;
//     }

//     int peek() {
//         return al.get(al.size() - 1);
//     }

//     int size() {
//         return al.size();
//     }

//     boolean isEmpty() {
//         return al.isEmpty();
//     }
// }

// class GFG {

//     public static void main(String[] args) {
//         MyStack s = new MyStack();
//         s.push(5);
//         s.push(10);
//         s.push(20);
//         System.out.println(s.pop());
//         System.out.println(s.size());
//         System.out.println(s.peek());
//         System.out.println(s.isEmpty());
//     }
// }

//linked lists

// import java.io.*;
// import java.util.*;

// class Node {
//     int data;
//     Node next;

//     Node(int d) {
//         data = d;
//         next = null;
//     }
// }

// class MyStack {
//     Node head;
//     int sz;

//     MyStack() {
//         head = null;
//         sz = 0;
//     }

//     void push(int x) {
//         Node temp = new Node(x);
//         temp.next = head;
//         head = temp;
//         sz++;
//     }

//     int pop() {
//         if (head == null) {
//             return Integer.MAX_VALUE;
//         }
//         int res = head.data;
//         Node temp = head;
//         head = head.next;
//         sz--;
//         return res;
//     }

//     int peek() {
//         if (head == null) {
//             return Integer.MAX_VALUE;
//         }
//         return head.data;
//     }

//     int size() {
//         return sz;
//     }

//     boolean isEmpty() {
//         return head == null;
//     }
// }

// class GFG {

//     public static void main(String[] args) {
//         MyStack s = new MyStack();
//         s.push(5);
//         s.push(10);
//         s.push(20);
//         System.out.println(s.pop());
//         System.out.println(s.size());
//         System.out.println(s.peek());
//         System.out.println(s.isEmpty());
//     }
// }

//can be done using JAVA collections framework- Stack and ArrayDeque
//by array deque-
/* package whatever //do not write package name here */

// import java.io.*;
// import java.util.*;
// import java.util.function.*;
// import java.util.stream.*;

// class GFG {

//     public static void main(String[] args) {

//         ArrayDeque<Integer> stack = new ArrayDeque<>();

//         stack.push(10);
//         stack.push(20);
//         stack.push(30);

//         System.out.println(stack.peek());
//         System.out.println(stack.pop());
//         System.out.println(stack.peek());

//     }

// }