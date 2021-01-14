import java.util.*;
public class selectionSort {
    ArrayList<Integer> arr;

    selectionSort(int sz){
        arr=new ArrayList<Integer>(sz);
    }

    public ArrayList<Integer> arrange() {
        for (int i = 0; i < arr.size() ; i++) {
            int min_ind=i;
            for (int j = i+1; j < arr.size(); j++) {
                if (arr.get(j) < arr.get(min_ind)) {
                    min_ind=j;
                }
            }
            int temp = arr.get(min_ind);
            arr.set(min_ind, arr.get(i));
            arr.set(i, temp);
        }
        return this.arr;
    }

    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        selectionSort obj = new selectionSort(5);
        obj.arr.add(8);
        obj.arr.add(2);
        obj.arr.add(1);
        obj.arr.add(6);
        obj.arr.add(9);
        obj.arr.add(5);
        obj.arr = obj.arrange();
        System.out.println("after sorting-");
        for (int i : obj.arr) {
            System.out.println(i);
        }
    }
}
