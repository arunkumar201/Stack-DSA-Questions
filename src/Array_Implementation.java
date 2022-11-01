public class Array_Implementation {
    int size;
    int []stack;
    int top;
    // constructor having size as parameter
    public Array_Implementation(int size){

        this.size=size;
      this.stack=new int[size];
       this.top=-1;
    }

    public static void main ( String[] args ) {
        Array_Implementation st=new Array_Implementation(10);
        st.push(12);
        st.push(1);
        st.push ( 42 );
        st.push(11);
        st.push ( 14 );
        st.push ( 15 );
        st.push ( 12 );
        st.push(11);
        st.push ( 15 );
        st.push ( 12 );
        st.push(11);
        st.Display ();
        int n1=st.pop();
        System.out.println ("\n poped Item is:"+n1);
        System.out.print("After Pop operation\n");
        st.Display ();
        System.out.println ("\nPeek Element is:"+st.peek ());
        System.out.println (st.isEmpty ());
    }

   public void push(int item){
     if(top==size-1){
            System.out.println ("Can't Insert Item Because Stack is Full");
            return;
        }
        else{
         top=top+1;
         stack[top]=item;
        }

    }

   public int pop(){
        int item;
        if(top==-1){
            System.out.println ("\nStack is Empty or goes Underflow");
            return -1;
        }
        else{
             item=stack[top];
              top--;
        }
        return item;
   }

   public void Display(){
        if(top==-1){
            System.out.println ("Stack is Empty");
        }
       System.out.print("Stack Contains:");
        int n=top;
        int i=0;
        while(n>=i){
            System.out.print(stack[i]+" ");
            i++;
        }
   }

   public int peek(){
        if(top==-1){
            System.out.println ("Stack is Empty");
            return -1;
        }
        else{
            return stack[top];
        }
   }
    public boolean isEmpty(){
        return (top<0);
    }
}
