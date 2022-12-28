import java.util.Stack;

public class LeetCode_402 {
    public static String removeKdigits(String s, int k) {
       Stack<Character> st=new Stack<Character>();
       char ch[]=s.toCharArray();
       String res="";
       st.push(ch[0]);
       for(int i=1;i<ch.length && k>0;i++){
           int curr_num=Integer.parseInt(String.valueOf(ch[i]));
           int top=0;
           if(!st.isEmpty()) top=Integer.parseInt(String.valueOf(st.peek()));
            if(!st.isEmpty() && curr_num<top){
                 k--;
                st.pop();
                st.push(ch[i]);
            }else
                st.push(ch[i]);
       }
        System.out.println(st);
       return res;
    }

    public static void main(String[] args) {
//        String num = "1432219";  //1219
        String num="10200";//200
        int k = 1;
        String res= removeKdigits(num,k);
        System.out.println("Final result is " + res);

    }
}
