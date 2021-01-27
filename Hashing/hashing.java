import java.util.*;
import java.io.*;

//uaing linear probing
class MyHash {
    int[] arr;
    int cap, size;

    MyHash(int c) {
        cap = c;
        size = 0;
        arr = new int[cap];
        for (int i = 0; i < cap; i++)
            arr[i] = -1;
    }

    int hash(int key) {
        return key % cap;
    }

    boolean insert(int key) {
        if (size == cap)        //checking if the array is filled already or not
            return false;
        int i = hash(key);
        while (arr[i] != -1 && arr[i] != -2 && arr[i] != key)//checking if the current node or position is empty(=-1) or deleted(=-2)
            i = (i + 1) % cap;                               //or the node is already present in the set
        if (arr[i] == key)
            return false;
        else {
            arr[i] = key;
            size++;
            return true;
        }
    }

    boolean search(int key) {
        int h = hash(key);
        int i = h;
        while (arr[i] != -1) {
            if (arr[i] == key)
                return true;
            i = (i + 1) % cap;
            if (i == h)
                return false;
        }
        return false;
    }

    boolean erase(int key) {
        int h = hash(key);
        int i = h;
        while (arr[i] != -1) {
            if (arr[i] == key) {
                arr[i] = -2;
                return true;
            }
            i = (i + 1) % cap;
            if (i == h)
                return false;
        }
        return false;
    }
}

class hashing {
    public static void main(String[] args) {
        MyHash mh = new MyHash(7);
        mh.insert(49);
        mh.insert(56);
        mh.insert(72);
        if (mh.search(56) == true)
            System.out.println("Yes");
        else
            System.out.println("No");
        mh.erase(56);
        if (mh.search(56) == true)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
