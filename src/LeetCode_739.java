import java.util.*;

public class LeetCode_739 {
    public static int[] dailyTemperatures(int[] t) {
      int n=t.length;
      if(n==1){
          return new int[]{0};
      }
      int[] res=new int[n];
      Stack<Integer> st=new Stack<>();
//     int count=0;
     for(int i=n-1;i>=0;i--){
          if(st.isEmpty()){
              res[i]=0;
          }else if(!st.isEmpty() && t[st.peek()]>t[i]){
              res[i]=st.peek()-i;
          } else if(!st.isEmpty() && t[st.peek()]<=t[i]) {
              while (!st.isEmpty() && t[st.peek()] <=t[i]) {
                  st.pop();
              }
              if (st.isEmpty()) {
                  res[i] = 0;
              } else {
                  res[i] = st.peek()-i;
              }
          }
          st.push(i);
      }
      return res;
    }

    public static void main(String[] args) {
        int a[]={73,74,75,71,69,72,76,73};
        int res[]=dailyTemperatures(a);
        System.out.println(Arrays.toString(res));



        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(12,23);
        mp.put(1,2);
        mp.put(42,83);
        System.out.println(Arrays.toString(mp.entrySet().toArray()));
        int r=mp.getOrDefault(12,0);
        System.out.println(r);
    }
}

