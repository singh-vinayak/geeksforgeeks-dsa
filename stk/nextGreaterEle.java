//modification  of stock span..
// we traverse from end this time
//o(n) or efficient


//import java.io.*;
import java.util.*;

class nextGreaterEle {

    public static ArrayList<Integer> nextGreater(int arr[], int n) {
        ArrayList<Integer> v = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        s.add(arr[n - 1]);
        v.add(-1);
        for (int i = n - 2; i >= 0; i--) {
            while (s.isEmpty() == false && s.peek() <= arr[i])
                s.pop();
            int ng = s.isEmpty() ? -1 : s.peek();
            v.add(ng);
            s.add(arr[i]);
        }
        Collections.reverse(v);
        return v;
    }

    public static void main(String[] args) {

        int[] arr = new int[] { 5, 15, 10, 8, 6, 12, 9, 18 };

        for (int x : nextGreater(arr, arr.length)) {
            System.out.print(x + " ");
        }

    }

}


//naive

// import java.io.*;
// import java.util.*;

// class GFG {

//     public static void printGreater(int arr[], int n) {

//         for (int i = 0; i < n; i++) {
//             int j;
//             for (j = i + 1; j < n; j++) {
//                 if (arr[j] > arr[i]) {
//                     System.out.print(arr[j] + " ");
//                     break;
//                 }
//             }
//             if (j == n)
//                 System.out.print(-1 + " ");
//         }
//     }

//     public static void main(String[] args) {

//         int[] arr = new int[] { 5, 15, 10, 8, 6, 12, 9, 18 };

//         printGreater(arr, arr.length);

//     }

// }