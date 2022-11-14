import java.util.HashMap;

public class LeetCode_771 {

    public static int numJewelsInStones_BruteForce(String je, String st) {
       //TC=O(n1*n2)
         int count=0;
         int n1=je.length();
         int n2=st.length();

         for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
               if(je.charAt(i)==st.charAt(j)){
                  count++;
               }
            }
         }
        return count;
    }

    public static int numJewelsInStones(String je, String st){
        int n1=je.length();
        int n2=st.length();
        int count=0;
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<n2;i++){
            if(mp.containsKey(st.charAt(i))){
                mp.put(st.charAt(i),mp.get(st.charAt(i))+1);
            }
            else{
                mp.put(st.charAt(i),1);
            }
        }
        for(int i=0;i<n1;i++) {
            if (mp.containsKey(je.charAt(i))) {
                count += mp.get(je.charAt(i));
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String jewels="aA";
        String stones="aAAbbbb";
        int res=numJewelsInStones(jewels,stones);
        System.out.println("Final res = " + res);
    }
}
