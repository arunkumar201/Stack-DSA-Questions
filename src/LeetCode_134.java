import java.util.Arrays;

public class LeetCode_134 {

    public static int canCompleteCircuit_Optimal(int[] gas, int[] cost) {
        int n=gas.length;
        // gas Value should be Greater or equal the cost
        //if Not we Can not the journey
//        We will Move ahead to the next station
        int total_fuel=0;
        int total_cost=0;
        for(int i=0;i<n;i++) {
            total_fuel+=gas[i];
            total_cost+=cost[i];
        }
        if(total_cost>total_fuel) return -1;
        int Curr_Tank=0;
        int rem_fuel=0;
        int start=0;
        for(int i=0;i<n;i++){
               Curr_Tank += gas[i] - cost[i];
               if (Curr_Tank < 0) {
                   Curr_Tank = 0;
                   start = i + 1;
             }
           }
        return start;
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        // gas Value should be Greater or equal the cost
        //if Not we Can not the journey
//        We will Move ahead to the next station
        int total_fuel = 0;
        int total_cost = 0;
        int []diff=new int[n];
        for (int i = 0; i < n; i++) {
            diff[i]=gas[i]-cost[i];
            total_fuel += gas[i];
            total_cost += cost[i];
        }
        System.out.println(Arrays.toString(diff));
        if(total_cost>total_fuel)  return -1;
        int i=0;
        int sum =0;
        int negsum=0;
     while(i<2*n){
            sum=0;
            for(int j=i+1;j<=2*n;j++){
                if(diff[j%n]<0){
                  negsum+=diff[j%n];
                }else{
                    sum+=diff[j%n];
                }
            }
            if(sum+negsum>=0){
                return i;
            }
            i++;
            negsum=0;
        }
        return -1;
    }
    public static void main(String[] args) {
         int  gas[]={1,2,3,4,5}, cost[] = {3,4,5,1,2};
//        int []gas = {2,3,4};
//        int cost[] ={3,4,3};
        int res=canCompleteCircuit(gas, cost);
        System.out.println("Final result: " + res);
    }
}
