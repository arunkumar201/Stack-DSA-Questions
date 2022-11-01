public class Stack_Linked_List {
    Node head;
    int size;

    public Stack_Linked_List () {
        head = null;
        size = 0;
    }

    class Node {
        int data;
        Node next;

        public Node ( int x ) {
            this.data = x;
            next = null;
        }
    }

    public static void main ( String[] args ) {
        Stack_Linked_List st = new Stack_Linked_List ();
        st.push ( 123 );
        st.push ( 334 );
        st.push ( 22 );
        st.push ( 23 );
        st.push ( 3 );
        st.Display ();
        st.pop ();
        System.out.println ( "\nAfter Popping" );
        st.Display ();
        System.out.println ( "\nPeek or top most data:" + st.peek () );
        st.pop ();
        st.Display ();
        System.out.print ("\n"+st.isEmpty () );
        st.push ( 152 );
        System.out.println ();
        st.Display ();
         st.pop();
         st.Display ();
        int s=st.getSize ();
        System.out.println ("\n size of LL:"+s);

    }

    void push ( int x ) {
        //there is no overflow because linked list  can grow as per Needed
        Node temp = new Node ( x );
        if (head == null) {
            head = temp;
            temp.next = null;

        } else {

            temp.next = head;
            head = temp;
        }
        size++;
    }

    int pop () {
        if (head == null) {
            return Integer.MAX_VALUE;
        }
        int item = head.data;
        head = head.next;
        size--;
        return item;
    }

    boolean isEmpty () {
        return head == null;
    }

        void Display () {
            if (head == null) {
                System.out.println ( " Stack is Empty or Underflow" );
                return;
            } else {

                Node temp = head;
                System.out.print ( "Stack Contains(top->...->:" );
                while (temp != null) {

                    // print node data
                    System.out.print ( temp.data + " " );

                    // assign temp link to temp
                    temp = temp.next;
                }
            }
        }

        public int peek() {
            if (head == null) {
                System.out.println ( "Stack is Empty" );
                return Integer.MAX_VALUE;
            } else {
                return head.data;
            }
        }

        int getSize(){
            return size;
        }

    }



