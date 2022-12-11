import java.util.Arrays;
import java.util.HashMap;

public class LeetCode_6257 {
    public static  int longestSquareStreak(int[] a) {
        int n=a.length;
        HashMap<Integer, Integer> mp=new HashMap<Integer, Integer>();
        int count=-1;
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            int res=(int)Math.sqrt(a[i]);
            if(res*res==a[i] && mp.containsKey(res)){
                mp.put(a[i],mp.get(res)+1);
                if(mp.get(res)+1>count){
                    count=mp.get(res)+1;
                }
            }else{
                mp.put(a[i],1);
            }
        }
return count;
    }
        public static  int deleteGreatestValue(int[][] a) {
            int m=a.length;
            int n=a[0].length;
            if(n==1 && m==1) {
                return a[0][0];
            }
            for(int i=0;i<n;i++) {
                Arrays.sort(a[i]);
            }
            int sum=0;
          for(int i=0;i<m;i++){
               int max=Integer.MIN_VALUE;
              for(int j=0;j<n;j++){
                  max=Math.max(max,a[j][i]);
              }
              sum+=max;
            }
            return sum;
        }
    public static void main(String[] args) {
        int a[][]={
                {9,81},{33,17}
    };
        int b[]={4,3,6,16,8,2};
        int res=longestSquareStreak(b);
        System.out.println("Final result is " + res);

    }
}
