import java.util.*;
import java.util.ArrayList;

class Job implements Comparable<Job> {
    int deadline;
    int profit;

    Job(int d, int p) {
        deadline = d;
        profit = p;
    }

    public int compareTo(Job j2) {
        return j2.profit - this.profit;
    }
}

public class jobSequencing {

    static void jobsequence(Job jobs[])
    {
        Arrays.sort(jobs);
        int last=jobs.length-1;

        ArrayList<Job> res=new ArrayList<Job>(jobs.length);

        for(int i=0;i<jobs.length;i++)
            res.add(new Job(0,0));

        res.set(jobs[0].deadline-1,jobs[0]);
        last--;
        
        for (int i=1;i<jobs.length;i++)
        {
            if(res.get(jobs[i].deadline-1).deadline!=0)
            {
                if(jobs[i].deadline-1>=last)
                res.set(last, jobs[i]);
            }
            else
            {
                res.set(jobs[i].deadline-1,jobs[i]);
                last=(jobs[i].deadline-1)!=last? last: last-1;
            }
        }
        System.out.println("Following jobs can be done : ");
        for(Job job:res)
        {
        System.out.print(job.deadline+" ");
        System.out.println(job.profit);
        }
    }

    public static void main(String args[]){
        Job jobs[]={new Job(2,50),
                    new Job(1,5),
                    new Job(1,20),
                    new Job(5,10),
                    new Job(5,80)};
        //int n=jobs.length;
        jobsequence(jobs);
    }
}