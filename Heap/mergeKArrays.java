//merge k arrays in sorted manner


//super naive method

// import java.io.*;
// import java.util.*;

// class Pair {
//     Integer key;
//     Integer value;

//     public Pair(Integer key, Integer value) {
//         this.key = key;
//         this.value = value;
//     }

//     public Integer getKey() {
//         return key;
//     }

//     public void setKey(Integer key) {
//         this.key = key;
//     }

//     public Integer getValue() {
//         return value;
//     }

//     public void setValue(Integer value) {
//         this.value = value;
//     }
// }

// class GFG {

//     public static ArrayList<Integer> mergeKArrays(ArrayList<ArrayList<Integer>> arr) {
//         ArrayList<Integer> res = new ArrayList<Integer>();

//         for (ArrayList<Integer> v : arr) {
//             for (Integer x : v)
//                 res.add(x);
//         }

//         Collections.sort(res);

//         return res;
//     }

//     public static void main(String[] args) {
//         ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();

//         ArrayList<Integer> a1 = new ArrayList<Integer>();
//         a1.add(10);
//         a1.add(20);
//         a1.add(30);
//         arr.add(a1);

//         ArrayList<Integer> a2 = new ArrayList<Integer>();
//         a2.add(5);
//         a2.add(15);
//         arr.add(a2);

//         ArrayList<Integer> a3 = new ArrayList<Integer>();
//         a3.add(1);
//         a3.add(9);
//         a3.add(11);
//         a3.add(18);
//         arr.add(a3);

//         ArrayList<Integer> res = mergeKArrays(arr);

//         System.out.println("Merged array is ");
//         for (int x : res)
//             System.out.print(x + " ");
//     }
// }


//naive below

// import java.io.*;
// import java.util.*;

// class GFG {

//     public static ArrayList<Integer> mergeArrays(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
//         int i = 0, j = 0;
//         ArrayList<Integer> arr3 = new ArrayList<Integer>();

//         while (i < arr1.size() && j < arr2.size()) {
//             if (arr1.get(i) < arr2.get(j))
//                 arr3.add(arr1.get(i++));
//             else
//                 arr3.add(arr2.get(j++));
//         }

//         while (i < arr1.size())
//             arr3.add(arr1.get(i++));

//         while (j < arr2.size())
//             arr3.add(arr2.get(j++));

//         return arr3;
//     }

//     public static ArrayList<Integer> mergeKArrays(ArrayList<ArrayList<Integer>> arr) {
//         ArrayList<Integer> res = arr.get(0);

//         for (int i = 1; i < arr.size(); i++) {
//             res = mergeArrays(res, arr.get(i));
//         }

//         return res;
//     }

//     public static void main(String[] args) {
//         ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();

//         ArrayList<Integer> a1 = new ArrayList<Integer>();
//         a1.add(10);
//         a1.add(20);
//         a1.add(30);
//         arr.add(a1);

//         ArrayList<Integer> a2 = new ArrayList<Integer>();
//         a2.add(5);
//         a2.add(15);
//         arr.add(a2);

//         ArrayList<Integer> a3 = new ArrayList<Integer>();
//         a3.add(1);
//         a3.add(9);
//         a3.add(11);
//         a3.add(18);
//         arr.add(a3);

//         ArrayList<Integer> res = mergeKArrays(arr);

//         System.out.println("Merged array is ");
//         for (int x : res)
//             System.out.print(x + " ");
//     }
// }


//efficient solution
import java.io.*;
import java.util.*;

class Triplet implements Comparable<Triplet> {
    int val, aPos, vPos;

    Triplet(int v, int ap, int vp) {
        val = v;
        aPos = ap;
        vPos = vp;
    }

    public int compareTo(Triplet t) {
        if (val <= t.val)
            return -1;
        else
            return 1;
    }
}

class mergeKArrays {

    public static List<Integer> mergeArr(ArrayList<ArrayList<Integer>> arr) {
        List<Integer> res = new ArrayList<Integer>();
        PriorityQueue<Triplet> pq = new PriorityQueue<Triplet>();

        for (int i = 0; i < arr.size(); i++)
            pq.add(new Triplet(arr.get(i).get(0), i, 0));

        while (pq.isEmpty() == false) {
            Triplet curr = pq.poll();
            res.add(curr.val);
            int ap = curr.aPos;
            int vp = curr.vPos;
            if (vp + 1 < arr.get(ap).size()) {
                pq.add(new Triplet(arr.get(ap).get(vp + 1), ap, vp + 1));
            }
        }

        return res;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();

        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        arr.add(a1);

        ArrayList<Integer> a2 = new ArrayList<Integer>();
        a2.add(5);
        a2.add(15);
        arr.add(a2);

        ArrayList<Integer> a3 = new ArrayList<Integer>();
        a3.add(1);
        a3.add(9);
        a3.add(11);
        a3.add(18);
        arr.add(a3);

        List<Integer> res = mergeArr(arr);

        System.out.println("Merged array is ");
        for (int x : res)
            System.out.print(x + " ");
    }
}
