import java.util.*;
public class dequeImplementation{
    int dq[],size,capacity;
    dequeImplementation(int n)
    {
        dq=new int[n];
        size=0;
        capacity=n;
    }
    boolean isFull()
    {
        return size==capacity;
    }
    boolean isEmpty(){
        return size==0;
    }
    void insertRear(int x)
    {
        if(isFull())
            return;
        dq[size++]=x;
    }
    
    void deleteRear() {
        if (isEmpty())
            return;
        size--;
    }
    int getRear()
    {
        if(isEmpty())
            return -1;
        return size-1;
    }
    
    void insertFront(int x) {
        if (isFull())
            return;
        for(int i=size-1;i>=0;i--)
            dq[i+1]=dq[i];
        dq[0]=x;
        size++;
    }

    void deleteFront() {
        if (isEmpty())
            return;
        for(int i=0;i<size-1;i++)
            dq[i]=dq[i+1];
        size--;
    }

    int getFront() {
        if (isEmpty())
            return -1;
        return 0;
    }

    void printDq()
    {
        if(isEmpty())
           {
                System.out.println("Empty");
                return;
            }
        for(int i=0;i<size;i++)
            System.out.print(dq[i]+" ");
        System.out.println();
    }

    public static void main(String[] args){
        dequeImplementation o=new dequeImplementation(10);
        o.insertFront(20);
        o.insertFront(10);
        o.insertRear(30);
        o.insertRear(40);
        o.printDq();
        System.out.println(o.getFront());
        System.out.println(o.getRear());
        o.deleteRear();
        o.deleteFront();
        o.printDq();
    }
}