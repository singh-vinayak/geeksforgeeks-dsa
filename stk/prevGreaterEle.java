//print previous greater elementt and break

//see stockSpan to learn this approach

//import java.io.*;
import java.util.*;

class prevGreaterEle {

    public static void printPrevGreater(int arr[], int n) {

        Stack<Integer> s = new Stack<>();
        s.add(arr[0]);
        for (int i = 0; i < n; i++) {
            while (s.isEmpty() == false && s.peek() <= arr[i])
                s.pop();
            int pg = s.isEmpty() ? -1 : s.peek();
            System.out.print(pg + " ");
            s.add(arr[i]);
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[] { 20, 30, 10, 5, 15 };

        printPrevGreater(arr, arr.length);

    }

}

//naive below

// import java.io.*;
// import java.util.*;

// class GFG {

//     public static void printPrevGreater(int arr[], int n) {

//         for (int i = 0; i < n; i++) {
//             int j;
//             for (j = i - 1; j >= 0; j--) {
//                 if (arr[j] > arr[i]) {
//                     System.out.print(arr[j] + " ");
//                     break;
//                 }
//             }
//             if (j == -1)
//                 System.out.print(-1 + " ");
//         }
//     }

//     public static void main(String[] args) {

//         int[] arr = new int[] { 20, 30, 10, 5, 15 };

//         printPrevGreater(arr, arr.length);

//     }

// }