import java.util.*;
public class bubbleSort {
    ArrayList<Integer> arr;
    bubbleSort(int sz){
        arr=new ArrayList<Integer>(sz);
    }
    public ArrayList<Integer> arrange(){
        int temp;
        for(int i=0;i<arr.size()-1;i++){
            for(int j=0;j<arr.size()-i-1;j++){
                if(arr.get(j)>arr.get(j+1)){
                    temp=arr.get(j);
                    arr.set(j,arr.get(j+1));
                    arr.set(j+1,temp);
                }
            }
        }
        return this.arr;
    }
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        bubbleSort obj=new bubbleSort(5);
        obj.arr.add(8);
        obj.arr.add(2);
        obj.arr.add(1);
        obj.arr.add(6);
        obj.arr.add(9);
        obj.arr.add(5);
        obj.arr=obj.arrange();
        System.out.println("after sorting-");
        for(int i:obj.arr){
            System.out.println(i);
        }
    }
}
