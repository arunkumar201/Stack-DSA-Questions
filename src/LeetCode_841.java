import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LeetCode_841 {


    public static  boolean canVisitAllRooms(List<List<Integer>> rooms) {
        HashSet<Integer> hs= new HashSet<>();

        for(List<Integer> r:rooms){
            for(int i=0; i<r.size();i++) {
                if (i == 0) hs.add(r.get(0));
                else {
                    if (!hs.contains(i)) {
                        return false;
                    }
                }
            }
        }

return true;

    }

    public static void main(String[] args) {
//   boolean res=canVisitAllRooms()
    }
}
