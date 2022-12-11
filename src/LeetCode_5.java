public class LeetCode_5 {

   private static boolean isPalidrome(String str){

         String rev = "";
       for (int i = str.length() - 1; i >= 0; i--) {
           rev = rev + str.charAt(i);
       }
       if(rev.equals(str)){
           return true;
       }
       return false;
   }
    public static String longestPalindrome(String s) {
       if(s.length()==0)
        return null;
       int max= Integer.MIN_VALUE;
       String res="";
       for(int i=0;i<s.length();i++){

           for (int j = i; j < s.length(); j++) {
                 String sub=s.substring(i,j+1);
               if(isPalidrome(sub)){
                   if(sub.length()>max){
                       max=sub.length();
                       res=sub;
                   }
               }
           }
       }
    return res;
    }
    public static void main(String[] args) {
        String s= "cbbd";
        String res=longestPalindrome(s);
        System.out.println("Final result: " + res);
    }
}
