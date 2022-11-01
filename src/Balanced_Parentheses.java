import java.util.*;

public class Balanced_Parentheses{

   static boolean CheckSymbol(char c1,char c2){
       boolean b=( (c1=='(' && c2==')') || (c1=='[' && c2==']') || (c1=='{' && c2=='}'));
        return b;
       }

   static boolean Balanced_Parentheses_Stack(String s){
           int n=s.length();
           if(s.length ()==0){
               return true;
           }
//           Stack<Character> st=new Stack<>();
//           char []ch=Arrays.toCharArray();
       ArrayDeque<Character> st=new ArrayDeque<> ();
           for(int i=0;i<n;i++) {
               if (s.charAt ( i ) == '(' || s.charAt ( i ) == '{' || s.charAt ( i ) == '[') {
                   st.push ( s.charAt ( i ) );
               }
               else {
                   if(st.isEmpty ()) return false;
                   if (!CheckSymbol ( st.peek (), s.charAt ( i ) )) {
                     return false;
                   }
                  else{
                      st.pop ();
                   }
               }
           }
               return (st.isEmpty ());
           }
    public static void main ( String[] args ) {
        String str="([]){}[[(){}]{}]";
//        String str="[(]))";
//        String str="{";
        //output: yes
        boolean res=Balanced_Parentheses_Stack(str);
       if(res)
        System.out.println ("Balanced");
       else
           System.out.println ("Not Balanced");

    }
}
