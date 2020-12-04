//naive approach
import java.util.*;
public class secondGreatest{
    ArrayList<Integer> arr;
    secondGreatest(int n){
        arr=new ArrayList<Integer>(n);
    }
    int greatest(ArrayList<Integer> a){
        int i,res=0;
        for(i=0;i<a.size();i++){
            if(a.get(i)>a.get(res))
                res=i;
        }
        return res;
    }
    int secondLar(){
        int s=arr.size(),res=-1;
        int l=greatest(arr);
        for(int i=0;i<s;i++){
            if(arr.get(i)!=arr.get(l)){
                if(res==-1)
                res=i;
                else{
                    if(arr.get(i)>arr.get(res))
                        res=i;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int sz;
        Scanner ob=new Scanner(System.in);
        sz=ob.nextInt();
        secondGreatest obj=new secondGreatest(sz);
        for(int i=0;i<sz;i++){
            obj.arr.add(ob.nextInt());
        }
        System.out.println(obj.secondLar());
        
    }
}
/**
 * efficient approach
 
int secondLArgest(int[] a,int size)
{
    int res=-1,largest=0;
    for(int i=0;i<size;i++){
        if(a[i]>a[largest]){
            res=largest;
            largest=i;
        }
        else if(a[i]!=a[largest]){
            if(res =-1 || a[i]>a[res]){
                res=i;
            }
        }
    }
}

 */