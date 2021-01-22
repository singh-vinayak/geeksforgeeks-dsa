import java.util.*;

public class findMedian {
    static int median(int [][] arr){
        int r=arr.length;
        int c=arr[0].length;
        int min=arr[0][0],max=arr[0][c-1];
        for(int i=0;i<r;i++){
            if(arr[i][0]<min)
                min=arr[i][0];
            if(arr[i][c-1]>max)
                max=arr[i][c-1];
        }
        int medP=(r*c+1)/2;
        while(min<max){
            int mid=(min+max)/2,midPos=0;
            for(int i=0;i<r;i++){
                int pos=Arrays.binarySearch(arr[i],mid)+1;
                midPos+=Math.abs(pos);
            }
            if(midPos<medP){
                min=mid+1;
            }
            else
                max=mid;
        }
        return min;
    }
    public static void main(String[] args){
        int arr[][]={{5,10,20,30,40},{1,2,3,4,6},{11,13,15,17,19}};
        System.out.println(median(arr));
    }
}
//log c * r* log(max-min)