import java.util.Stack;

public class Intro_Stack
{
    public static void main ( String[] args ) {
        System.out.println ("Hello Stack");
        Stack<Integer> st=new Stack<> ();
        st.push ( 12 );
        st.push(11);
        st.add ( 14 );
        st.push ( 15 );
        st.pop ();

        st.push ( 90 );
        System.out.println (st);
        System.out.println (st.pop());
        System.out.println (st.peek ());
        System.out.println (st.isEmpty ());
        System.out.println (st.size ());
        System.out.println (st.search ( 11 ));
        System.out.println (st.capacity ());
        System.out.println (st.contains ( 11 ));
        System.out.println (st.isEmpty ());
//        System.out.println (st.get ( 0 ));
    }
}
