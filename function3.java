import java.util.*;
public class function3
{
    public static int MultiplyNum(int a,int b)
    {
      int multiply = a*b;
      return multiply;
    }
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();

      int multiply = MultiplyNum( a, b);
      System.out.println("Ans 3 : " + multiply);

    }
}
