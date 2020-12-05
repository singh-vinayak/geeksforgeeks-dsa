import java.util.*;
class moveZero{
    static int[] move(int arr[]){
            int count=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=0){
                    int temp=arr[i];
                    arr[i]=arr[count];
                    arr[count]=temp;
                    count++;
                }
            }
            return arr;
    }
    public static void main(String[] args){
        int n;
        Scanner ob=new Scanner(System.in);
        n=ob.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=ob.nextInt();
        a=move(a);
        System.out.println("New array- ");
        for(int i=0;i<n;i++)
        System.out.println(a[i]);
    }
}