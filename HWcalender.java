import java.util.*;
public class HWcalender 
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int op = sc.nextInt();
        
        

        switch(op){
        case 1:
            System.out.println("january");
            break;
        case 2:
            System.out.println("februry");
            break;
        case 3:
            System.out.println("march");
            break;
        case 12:
            System.out.println("december");
            break;
        default:
            System.out.println("invalid");

        }  
    }
    
}
