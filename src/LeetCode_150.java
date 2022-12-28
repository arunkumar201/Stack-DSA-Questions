import java.util.Stack;

public class LeetCode_150 {
    public static String lookUp(String ch){
        if(ch.equals("*")){
            return "*";
        }else if(ch.equals("/")){
            return "/";
        }else if(ch.equals("+")){
            return "+";
        }else if(ch.equals("-")){
            return "-";
        }
        return "-1";
    }
    public static int evalRPN(String[] s) {
        int n=s.length;
        if(n==1){
           int res=Integer.parseInt(s[0]);
           return res;
        }
        Stack<String> st=new Stack<>();
        int ans=0;
        for(String x:s) {
          String t=lookUp(x);
          if(t.equals("-1")){
              st.push(x);
          }
          else {
              if (!st.isEmpty()) {
                  String t2 = x;
                  String op1 = st.pop();
                  String op2 = st.pop();
                  int o2 = Integer.parseInt(op2);
                  int o1 = Integer.parseInt(op1);
                  if (t2.equals("*")) {
                      ans=o2 * o1;
                  } else if (t2.equals("+")) {
                      ans =  o2 + o1;
                  } else if (t2.equals("-")) {
                      ans = o2- o1;
                  } else if (t2.equals("/")) {
                      ans =(o2 / o1);
                  }
                  String r = Integer.toString(ans);
                  st.push(r);
              }
          }
        }
        int final_ans=Integer.parseInt(st.pop());
        return final_ans;
    }
    public static void main(String[] args) {
        String []tokens = {"2","1","+","3","*"};
        int res = evalRPN(tokens);
        System.out.println(res);

    }
}
