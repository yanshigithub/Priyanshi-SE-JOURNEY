import java.util.*;
public class HWCalculator {
    public static void main(String[] agrs)
    {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();

       System.out.print("Enter operator (+, -, *, /): ");
       char op = sc.next().charAt(0);

       if (op == '+'){
       System.out.println("result = " + a+b);
       }
       else if(op =='-')
       {
       System.out.println("result = " +(a-b));
       }
       else if(op =='*')
       {
        System.out.println("result = " + a*b);
       }
       else if(op == '%')
       {
        System.out.println("result = " + a%b);
       }



    }
    
}
