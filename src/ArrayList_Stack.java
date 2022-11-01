import java.util.ArrayList;

public class ArrayList_Stack {
    static ArrayList<Integer> st = new ArrayList<> ();

    void push ( int x ) {
        st.add(x);
    }
    int pop() {
        if (st.size () - 1 == -1) {
            System.out.println ( "Stack is Empty" );
            return -1;
        } else {
            int item=st.get(st.size ()-1);
            st.remove (st.size ()-1);
            return item;
        }
    }
    int peek() {
        if (st.size () - 1 == -1) {
            System.out.println ( "Stack is Empty" );
            return -1;
        }
        return st.get( st.size ()-1 );
    }
    boolean isEmpty(){
        if(st.size ()-1<0){
            return true;
        }
        return false;
    }

    void Display(){
        for(int x:st){
            System.out.print(x+" ");
        }
    }


    public static void main ( String[] args ) {
     ArrayList_Stack li=new ArrayList_Stack ();
     li.push(123);
     li.push(21);
       li.Display();
       int item=li.pop ();
        System.out.println ("\n Poped item is "+item);
li.push ( 346 );
        li.Display();
    }
}
