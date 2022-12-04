import java.util.Arrays;

public class LeetCode_6253 {
    public static boolean isCircularSentence(String s) {
      int n=s.length();
      if(n==0)
        return false;
      if(n==1){
          return true;
      }
      char[] ch=s.toCharArray();
      Character c1=ch[0];
      Character c2=ch[n-1];
        System.out.println(Arrays.toString(ch));
      if(!(c1.equals(c2))) return false;
//
//      for(int i=0;i<n;i++){
//          Character c=ch[i+1];
//          if()
        String[] s1 =s.split(" ");
        for(int i=0;i<s1.length-1;i++){
//            System.out.println(s1[i]);
            int x=s1[i].length()-1;
            Character c3=s1[i].charAt(x);
            Character c4=s1[i+1].charAt(0);
            if(!(c3.equals(c4))) {
                return false;
            }
        }
     return true;
    }
    public static void main(String[] args) {
        String s="leetcode exercises sound delightful";
        boolean res=isCircularSentence(s);
        System.out.println("Final result is " + res);
    }
}
