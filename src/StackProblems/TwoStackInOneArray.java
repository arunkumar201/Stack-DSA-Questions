package StackProblems;

public class TwoStackInOneArray {
      int size;
      int top1=-1;
      int top2;
      int size1;
      int size2;
     int a[];
     static class MyStack extends TwoStackInOneArray {
         public  MyStack(int n) {
                size=n;
               a=new int[n];
                top2=n/2-1;
               size1=n/2;
               size2=n/2+1;
         }
     }
    public static void main(String[] args) {
           TwoStackInOneArray s= new TwoStackInOneArray();
           TwoStackInOneArray st= new MyStack(10);
           st.push1(12);
           st.push1(23);
           st.push1(24);
//           System.out.println("Pop1() function returns: " + st.pop1());
             st.push1(27);
             st.pop1();
          System.out.print("stack 1 Data: ");
          st.Display1();
          System.out.println();
             st.push2(1);
             st.push2(2);
             st.push2(3);
             st.push2(4);
             st.push2(5);
        st.pop2();
        st.pop2();
//        st.pop2();
        st.push2(23);
        st.push2(24);
        System.out.print("stack 2 Data: ");
        st.Display2();
      st.push1(234);
        st.push1(234);
        st.push1(234);
        st.push2(120);

    }

    void push1(int n) {
//        System.out.println(n/2);
         if(top1>=size/2-1) {
             System.out.println("\n stack 1 is Full"+" Can't able to Add:"+n+" Into a stack1");
             return;
         }
         else
         a[++top1]=n;
    }
    void Display1() {
         if(top1==-1){
             System.out.println("stack 1 is Empty");
             return;
         }
         int i=0;
         while(i<=top1){
             System.out.print(a[i]+" ");
             i++;
         }
    }

    int pop1(){
         if(top1==-1){
             System.out.println("stack 1 is Empty");
             return -1;
         }
         int data=a[top1];
         top1--;
         return data;
    }

    void push2(int x) {
        if(top2==size-1){
            System.out.println("stack 2 is Full");
            return;
        }
        top2++;
        a[top2]=x;

    }
    int pop2(){
         if(top2==size/2-1){
             System.out.println("stack 2 is empty");
             return - 1;
         }
           int data=a[top2];
           top2--;
          return data;
    }
   void Display2(){
         if(top2==size/2-1){
             System.out.println("stack 2 is Empty");
         }
         int i=size / 2;
         while(i<=top2){
             System.out.print(a[i]+" ");
             i++;
         }
   }
}
