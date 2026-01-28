import java.util.*;
public class recurFactorial {
    public static int printNumber(int n) {
        if (n == 1|| n== 0){
            return 1;
        }
        int fact_nm1 = printNumber(n-1);
        int fact_n = n*fact_nm1;
        return fact_n;

    }
  public static void main(String[] args) {
    int n = 5;
    int ans = printNumber(n);
    System.out.println(ans);
  }     
}

