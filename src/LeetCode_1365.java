import java.util.Arrays;
import java.util.HashMap;

public class LeetCode_1365 {

    public static int[] smallerNumbersThanCurrent_BruteForce(int[] a){
        int n = a.length;
        int res[]=new int[n];

        for (int i = 0; i < n; i++) {
          int count=0;
            for(int j = 0; j <n;j++){
                if(a[j]<a[i]){
                    count++;
                }
            }
            res[i]=count;
        }
return res;
    }
    public static int[] smallerNumbersThanCurrent(int[] a) {
        int n = a.length;
        int res[]=new int[n];
        HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
        for(int i:a){
            if(mp.containsKey(i)){
                mp.put(i,mp.get(i)+1);
            }
            else{
                mp.put(i,1);
            }
        }

        for(int i:a){
            if(5==0){
                res[mp.get(i)-1]=i;
            }

        }

        return null;
    }
    public static void main(String[] args) {
        int a[]={8,1,2,2,3};
        int res[]=smallerNumbersThanCurrent_BruteForce(a);

        System.out.println("Final result is " + Arrays.toString(res));
    }
}
