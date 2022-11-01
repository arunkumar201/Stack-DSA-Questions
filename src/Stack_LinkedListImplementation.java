import java.util.LinkedList;

public class Stack_LinkedListImplementation {


    public static void main ( String[] args ) {

        LinkedList<Integer> st=new LinkedList<> ();
        st.push ( 234 );
        st.push ( 54 );
        System.out.println (st);
        System.out.println (st.pop ());
        System.out.println (st);
        st.pop ();
        System.out.println (st);
        st.push(23);
        System.out.println (st.peek());
        st.pop ();
        System.out.println (st.size ());
        System.out.println (st.isEmpty ());

    }
}
