import java.util.*;
class search{
}
class binary extends search{

    ArrayList<Integer> b;
    binary(int n){
        this.b=new ArrayList<Integer>(n);
    }
    void see(int l,int h,int el){
        while(l!=h){
            int mid=(l+h)/2;
            if(b.get(mid)==el)
            {
                System.out.println(mid);
                return;
            }
            else if(b.get(l)<el)
                l=mid+1;
            else if(b.get(l)>el)
                h=mid-1;
        }
        if(l==h)
        System.out.println(-1);
    }
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        int nu;
        int n = ob.nextInt();
        binary obj=new binary(n);
        for(int i=0;i<n;i++){
           nu=ob.nextInt();
           obj.b.add(nu);
        }
        int ele=ob.nextInt();
        obj.see(0,n-1,ele);
    }
}