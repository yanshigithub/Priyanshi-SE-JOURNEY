import java.util.*;
 
public class SWCalculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a num1");
        int num1 = sc.nextInt();

        System.out.println("enter a num2");
        int num2 = sc.nextInt();

        System.out.println("Enter operator  (+ ,-,*,/):" );
        char op = sc.next().charAt(0);

        switch(op){
        case '+':
          System.out.println("Result: =" + (num1 + num2));
          break;
        case '-':
         System.out.println("Result: =" + (num1 - num2));
         break;
        case '*' :
         System.out.println("Result: =" + (num1 * num2));
         break;
        case '/':
        System.out.println("Result: =" +( num1 /23 num2));
        break;
        default:
            System.out.println("Invalid");
        }

    sc.close();
    }
}