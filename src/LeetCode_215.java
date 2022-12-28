import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LeetCode_215 {

    public static int findKthLargest(int[] a, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Comparator.reverseOrder());
        for(int i=0;i<a.length;i++){
            pq.add(a[i]);
        }
        int res=0;
        pq.add(11);
        pq.add(11);
        System.out.println(pq);
        while(pq.size()>0 && k!=0){
            res=pq.poll();
            k--;
        }

        System.out.println(pq);
      return res;
    }

    public static void main(String[] args) {
        int a[]={3,2,1,5,6,4};
        int k=2;
        int res=findKthLargest(a,k);
        System.out.println("Final result is " + res);
    }
}
