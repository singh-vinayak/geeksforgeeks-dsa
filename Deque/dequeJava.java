// Java program to demonstrate the working 
// of a Deque in Java


//addFirst=offerFirst; addFirst throws exception
//addLast=offerLast; addLast throws exception
//removeFirst=pollFirst; removeFirst throws exception on null
//removeLast=pollLast; removeLast throws exception on null
//getFirst=peekFirst; getFirst throws exception on null
//getLast=peekLast; getLast throws exception on null

import java.util.*; 
  
public class dequeJava { 
    public static void main(String[] args) 
    {
        Deque<Integer> d = new LinkedList<Integer>();
        
        // Adds element to front of queue
        d.offerFirst(10);
        
        // Adds element to end of queue
        d.offerLast(20);
        
        // Adds element to front of queue
        d.offerFirst(5);
        
        // Adds element to end of queue
        d.offerLast(15);
        
        // Retrieve the head element
        System.out.println(d.peekFirst());
        
        // Retrieve the tail element
        System.out.println(d.peekLast());
        
        // Retrieve and remove the head element
        d.pollFirst();
        
        // Retrieve and remove the tail element
        d.pollLast();
        
        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());
        
        Iterator it = d.iterator();
        while(it.hasNext())
            System.out.print(it.next() + " ");
        
        // Traversal using Iterator
        Iterator it1 = d.descendingIterator();
        while(it1.hasNext())
            System.out.print(it1.next() + " ");
        
    }
}