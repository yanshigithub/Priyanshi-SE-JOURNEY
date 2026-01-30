import java.util.*;
public class recur6 {
    public static int calPower(int x,int n){
       if( n== 0){ // base case1
        return 1;
       }
       if(x == 0){
        return 0;
       }
        int xPower1 = calPower(x , n-1); //kaam
        int xPown = x * xPower1;
        return xPown;
    
    }
    public static void main(String[]args){
        int x =2;
        int n = 5;
        int ans  = calPower(x,n);
        System.out.println(ans);
    }

    
}
