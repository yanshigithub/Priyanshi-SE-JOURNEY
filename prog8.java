import java.util.*;

public class prog8 
{
 public static void main(String agrs[])
 {
 Scanner sc = new Scanner(System.in) ;
 int a = sc.nextInt();
 int b = sc.nextInt();
 

 if(a == b)
 {
    System.out.println("equal");
 }
 else
    {
        if(a > b)
        {
        System.out.println("a is greater");
        }
        else{
            System.out.println("a is lesser");
        }
    }   
}
}
