//get the maximum items with given sum
//first approach- sorting
import java.util.*;
import java.io.*;
import java.lang.*;

class maxGivenSum {

    public static void main(String args[]) {
        int n = 5;
        int cost[] = new int[] { 1, 12, 5, 111, 200 };
        int sum = 10;

        int res = 0;
        Arrays.sort(cost);
        for (int i = 0; i < n; i++) {
            if (cost[i] <= sum) {
                sum -= cost[i];
                res++;
            } else {
                break;
            }
        }
        System.out.print(res);

    }

}

//second approach - using heap

// o(n* log n) upper bound

// public static void main(String args[]) 
//     { 
//         int n=5;
//         int cost[]=new int[]{1,12,5,111,200};
//         int sum=10;
        
//         PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        
//         int res=0;
//         for(int i=0;i<n;i++)
//             pq.add(cost[i]);
        
//         for(int i=0;i<n;i++){
//             if(pq.peek()<=sum){
//                 sum-=pq.poll();
//                 res++;
//             }else{
//                 break;
//             }
//         }
//         System.out.print(res);
    	
//     }