import java.util.*;

public class LeetCode_2225 {
    public static List<List<Integer>> findWinners(int[][] matches) {

        List<List<Integer>> res = new ArrayList<>();

        HashMap<Integer,Integer> mp_Win=new HashMap<>();
        HashMap<Integer,Integer> mp_Loose=new HashMap<>();
        //Win Map
        for(int i=0; i<matches.length; i++) {
            if(mp_Win.containsKey(matches[i][0])){
                mp_Win.put(matches[i][0],mp_Win.get(matches[i][0])+1);
            }
            else
            mp_Win.put(matches[i][0],1);
           }

        System.out.println("Win is"+mp_Win);
        //looses Map
        for(int i=0; i<matches.length; i++) {
            if(mp_Loose.containsKey(matches[i][1])){
                mp_Loose.put(matches[i][1],mp_Loose.get(matches[i][1])+1);
            }
            else{
            mp_Loose.put(matches[i][1],1);
            }
        }
        System.out.println("loose map"+mp_Loose);;
         List<Integer> li1=new ArrayList<Integer>();
        for (int i = 0; i < matches.length; i++) {
            if(mp_Loose.get(matches[i][1])==1){
                li1.add(matches[i][1]);
            }
        }
        Collections.sort(li1);
        System.out.println(li1);
        List<Integer> li2=new ArrayList<Integer>();
        HashSet<Integer> hs1=new HashSet<Integer>();
        for (int i = 0; i < matches.length; i++) {
//            System.out.println(mp_Loose.get(matches[i][1]));
            if(!mp_Loose.containsKey(matches[i][0]) && !hs1.contains(matches[i][0])){
                li2.add(matches[i][0]);
                hs1.add(matches[i][0]);
            }
        }
        Collections.sort(li2);
        System.out.println(li2);

        res.add(li2);
        res.add(li1);

        return res;
    }

    public static void main(String[] args) {
        int a[][]= {
                {1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7}, {4, 5}, {4, 8}, {4, 9}, {10, 4}, {10, 9}
        };  //Output: [[1,2,10],[4,5,7,8]]
        List<List<Integer>> li=findWinners(a);
        System.out.println("Final result is " + li);
        }
}
