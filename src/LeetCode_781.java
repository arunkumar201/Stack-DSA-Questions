import java.util.HashMap;
import java.util.HashSet;

public class LeetCode_781 {
    public  static  int numRabbits(int[] a) {
        int n=a.length;
        if(n==1){
            return 1+a[0];
        }
        int count=0;
        HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
        for(int j=0;j<n;j++){
            mp.put(j,mp.getOrDefault(j,0)+1);
        }
        int ans=0;
        for(int k: mp.keySet()){
            int group_size=k+1;
            int report_size=mp.get(k);
            int total_group=(int)Math.ceil(report_size*1.0/group_size*1.0);
            ans+=total_group*group_size;

        }
        return ans;
    }

    public static void main(String[] args) {
        int a[]={10,10,10};
        int res=numRabbits(a);
        System.out.println("Final result is " + res);
    }
}
