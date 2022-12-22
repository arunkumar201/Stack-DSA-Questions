import java.util.HashMap;

public class LeetCode_2589 {

    public static  int similarPairs(String[] s) {
     int n=s.length;
     if(n==1){
         return 0;
     }
     int count=0;
     for(int i=0; i<n; i++) {

         for(int j=i+1;j<n;j++){
           int f=0;
            for(int k=0;k<26;k++) {
                char ch = (char) (int) ('a' + k);
                if ((s[i].indexOf(ch) == -1 && s[j].indexOf(ch) != -1) || (s[i].indexOf(ch) != -1 && s[j].indexOf(ch) == -1)) {
                    f = 1;
                    break;
                }
            }
                if(f==0){
                    count++;
                }

         }

     }
     return count;

    }


    public static void main(String[] args) {
     String []s={"aabb","ab","ba"};
     int res=similarPairs(s);
        System.out.println("FInal result is " + res);
    }
}
