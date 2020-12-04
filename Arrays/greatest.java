import java.util.*;
class greatest{
    ArrayList<Integer> num;
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        ArrayList<Integer> num=new ArrayList<Integer>(n);
        for(int i=0;i<n;i++)
        num.add(ob.nextInt());
        int res=0;
        for(int i=0;i<num.size();i++){
            if(num.get(res)<num.get(i))
                res=i;
        }
        System.out.println(res);
    }
}