
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
public class GFG_1 {
    //Two numbers with odd occurrences

    public  static <v> int[] twoOddNum(int a[], int n)
    {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int j=0;
        for(int i:a){
            if(mp.containsKey(i)){
                mp.put(i,mp.get(i)+1);
            }
            else{
                mp.put(i,1);
            }
        }
        System.out.println(mp);
        int ans[]=new int[2];
        int k=0;
        for (Map.Entry<Integer,Integer> e : mp.entrySet()){
            if( e.getValue()%2!=0 && (k>1  || a[k]!=e.getKey())){
                ans[k++]=e.getKey();
            }
        };

        int max=Math.max(ans[0],ans[1]);
        int min=Math.min(ans[0],ans[1]);
        ans[0]=max;
        ans[1]=min;
        System.out.println(Arrays.toString(ans));
        return ans;
    }
    public static void main(String[] args) {
        int[] arr ={34 ,52 ,45 ,15, 23 ,23, 22, 22 ,34 ,52 ,15, 9 ,34 ,23 ,22 ,43, 9 ,23, 23 ,23 ,23 ,45, 9 ,34 ,22 ,22 ,22 ,52, 34 ,23 ,34 ,43 ,23 ,23 ,34, 22 ,22, 9, 52 ,43 ,27,34};
        int ans[]=twoOddNum(arr, arr.length);
        System.out.println(Arrays.toString(ans));
    }
}
