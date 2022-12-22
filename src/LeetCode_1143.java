public class LeetCode_1143 {
 public static int getLength(String s1,String s2){
        int n1=s1.length();
        int n2=s2.length();
        int i=0;
        int j=0;
        int count=0;
        while(i<n1 && j<n2){
            Character c1=s1.charAt(i);
            Character c2=s2.charAt(j);
            if(c1.equals(c2)){
                i++;
                j++;
                count++;
            }else{
                i++;
            }
        }
        return count;
    }
    public static int longestCommonSubsequence(String s1, String s2) {
      int n1=s1.length();
      int n2=s2.length();
      if(n2>n1){
        return getLength(s2,s1);
      }
      else{
          return getLength(s1,s2);
      }
    }

    public static void main(String[] args) {
        String text1 = "abcde", text2 = "ace";
        int result = longestCommonSubsequence(text1, text2);
        System.out.println("FInal result = " + result);
    }
}
