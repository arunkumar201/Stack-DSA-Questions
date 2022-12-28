import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class LeetCode_1962 {
    public static int minStoneSum_BruteForce(int[] piles, int k) {
      int n=piles.length;
        int t=k;
        Arrays.sort(piles);
      int sum=0;
      int i=n-1;
        while(k>0) {
            piles[i] -= (int) piles[i] / 2;
            Arrays.sort(piles);
            k--;
        }
        sum = Arrays.stream(piles).sum();
        return sum;
    }
    public static int minStoneSum(int[] piles, int k) {
        int n = piles.length;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int item : piles) {
            pq.add(item);
        }
        int sum = 0;
        while (k > 0) {
            int t= pq.peek();
            pq.remove();
            t-=t/2;
            pq.add(t);
            k--;
        }
     while(!pq.isEmpty())
            sum += pq.poll();

        return sum;
    }

    public static void main(String[] args) {
//        int []piles = {4,3,6,7};
        int []piles={1};
        int k =10000;
//        System.out.println(Math.floor(1.5));
//        System.out.println(Math.floor(3.6));
//        System.out.println(Math.round(1.4));
        int res=minStoneSum(piles,k);
        System.out.println("Final res: " + res);
    }
}
