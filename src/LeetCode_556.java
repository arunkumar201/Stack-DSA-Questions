import java.util.Stack;

public class LeetCode_556 {

    public static int nextGreaterElement(int n) {
        if(n<10){
            return -1;
        }
        String s=Integer. toString(n);
        char ch[]=s.toCharArray();
        int len=s.length();
        Character firstDigit=s.charAt(0);
        if(firstDigit.equals("9"))  return -1;
        int res=-1;
        int idx=0;
        String str = new String();
        Stack<Integer> st = new Stack<Integer>();
        for(int i=len-1; i>=1; i--){
            st.push(s.charAt(i)-'0');
        }
        int j=0;
        int z=0;
        for(int i=0;i<len;i++){
             j=i;
            int x=s.charAt(i)-'0';
            if(st.isEmpty()) {
                res=-1;
            }
            else if(!st.isEmpty() && st.peek()>x) {
               res=0;
               idx=j;
               z=i;
            }
            else if(!st.isEmpty() && st.peek()<=x) {
                while(!st.isEmpty() && st.peek()<=x){
                    st.pop();
                    j++;
                }
                if(st.isEmpty()) {
                    res= -1;
                }
                else if(st.peek()>x){
                    res=0;
                    idx=j;
                    z=i;

                }
            }
            st.push(x);
        }
        System.out.println(res);
        if(res==-1) return -1;
        System.out.println("Next Greater Element is "+res+" Index is " + idx);
        char temp=ch[z];
        ch[z]=ch[idx];
        ch[idx]=temp;
        String ans=str.valueOf(ch);
        return Integer.parseInt(ans);
    }

    public static void main(String[] args) {
        int n=21;
        int res=nextGreaterElement(n);
        System.out.println("Final result is " + res);
    }
}
