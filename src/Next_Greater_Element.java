import java.util.Arrays;
import java.util.Stack;

public class Next_Greater_Element {
    public static long[] nextLargerElement1(long[] a, int n) {
        long[] result = new long[n];
        for (int i = 0; i < n; i++) {
            result[i] = -1;
        }
        {


            if (n == 1) {
                return new long[]{-1};
            }
            result[n - 1] = -1;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j <n; j++) {
                    if (a[j] > a[i]) {
                        result[i] = a[j];
                        break;
                    }
                }
            }


            return result;
        }
    }


    public static long[] nextLargerElement(long[] a, int n){
        //Base case
        //if input array length is equal to 1
        //the there is no next of that element
        // we will put as -1 in the result for that element
        if(n==1){
            return new long[]{-1};
        }
        //Here we are creating the stack
        Stack<Long> st= new Stack<>();
        //Resultent Array
        long[] result= new long[n];

// We will Start at the end and Pushing the item in the stack
//before pushing we wil check some below condition
//there are mainly three conditions the we need to check
        for(int i=n-1; i>=0; i--) {

//1. if stack is empty it means there is no next to it
// we will will put -1 in the result array
            if(st.isEmpty()){
                result[i] = -1;
            }
            //2. we need check if top of the stck is greater then the current item/element a[i]
            //before checking we need to check stack is empty or not otherwise we will get underflow error
            //if both the condtions are true then we can take the top element from the stack and store it in result
            //array becouse  we found  just next greater immediatly
            else if(!st.isEmpty() && st.peek()>a[i]){
                result[i] =st.peek();
            }
            //else of the above case
            //lets say top of the stack is less than current item then we need popped the items until we found
            //a element is greater  or is our stack is become empty
            //based on the termination of while loop condtion
            //we will decide the result/output
            else if(!st.isEmpty() && st.peek()<=a[i]){
                while(!st.isEmpty() && st.peek()<=a[i]) {
                    st.pop();
                }
                //if while loop terminate due to empty or stack becomes empty
                //we will already do it in the early step where we will put -1 as result in the result array
                if(st.isEmpty()){
                    result[i] = -1;
                }
                //else put top item of the stack in the array
                //as our loop must terminate becouse we were found the greater element
                else {
                    result[i] = st.peek();
                }
            }

            st.push(a[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        long a[] = {6 ,8 ,0, 1, 3};
        int n = a.length;
        long res1[] = nextLargerElement1(a, n);
        System.out.println("Final result O(N^2): " + Arrays.toString(res1));
        long res[] = nextLargerElement(a, n);
        System.out.println("Final Answer is using Stack " + Arrays.toString(res));
    }
}

