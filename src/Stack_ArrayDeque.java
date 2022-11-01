import java.util.ArrayDeque;

public class Stack_ArrayDeque {

    public static void main ( String[] args ) {

        ArrayDeque<Integer> st=new ArrayDeque<> ();

        st.push ( 12 );
        st.push ( 23 );
        st.push ( 22 );
        System.out.println (st);
        System.out.println ("Top Element is:"+st.peek ());
        System.out.println ("Check Stack is Empty or not:"+st.isEmpty ());
        st.push ( 233 );
        st.pop ();
        System.out.println ("Size or length of the stack:"+st.size ());
    }
}
