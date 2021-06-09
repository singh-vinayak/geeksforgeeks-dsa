
// Java program to demonstrate working of
// ArrayDeque in Java
import java.util.ArrayDeque;

class arrDeque {
    public static void main(String args[]) {
        // Creating empty ArrayDeque as Queue
        ArrayDeque<Integer> ad = new ArrayDeque<Integer>();

        // Add items to the ad using offer() at last
        ad.offer(10);
        ad.offer(20);

        // Returns the front of queue, 10
        System.out.println(ad.peek());

        // Returns and Removes the front of queue, 10
        System.out.println(ad.poll());

        // Returns the front of queue, 20
        System.out.println(ad.peek());

        // Adds 40 to last of queue
        ad.offer(40);

        // Returns the front of queue, 20
        System.out.println(ad.peek());
    }
}

// as a stack


// Java program to demonstrate working of
// ArrayDeque in Java
// import java.util.ArrayDeque;

// class GfG {
//     public static void main(String args[]) {
//         // Creating empty ArrayDeque
//         ArrayDeque<Integer> ad = new ArrayDeque<Integer>();

//         // Pushing items to the ad using add()
//         ad.push(10);
//         ad.push(20);

//         // Returns the top of stack, 20
//         System.out.println(ad.peek());

//         // Returns and Removes the top of stack, 20
//         System.out.println(ad.pop());

//         // Returns the top of stack, 10
//         System.out.println(ad.peek());

//         // Pushes 40
//         ad.push(40);

//         // Returns the top of stack, 40
//         System.out.println(ad.peek());
//     }
// }


//as deque

// Java program to demonstrate working of
// ArrayDeque in Java
// import java.util.ArrayDeque;

// class GfG {
//     public static void main(String args[]) {
//         // Creating empty ArrayDeque as Deque
//         ArrayDeque<Integer> ad = new ArrayDeque<Integer>();

//         // Add items to the ad
//         ad.offerFirst(10);
//         ad.offerLast(20);
//         ad.offerFirst(30);
//         ad.offerLast(40);

//         // Returns 30
//         System.out.println(ad.peekFirst());

//         // Returns 40
//         System.out.println(ad.peekLast());

//         // Returns and removes 30
//         System.out.println(ad.pollFirst());

//         // Returns 10
//         System.out.println(ad.peekFirst());

//         // Returns and removes 40
//         System.out.println(ad.pollLast());

//         // Returns 20
//         System.out.println(ad.peekLast());
//     }
// }
