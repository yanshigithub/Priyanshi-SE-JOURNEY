import java.util.*;
public class stringB2 {
        public static void main(String [] args)
    {
        StringBuilder sb = new  StringBuilder("yanshi");
        System.out.println(sb);
        
        // INSERT TONY = TONNY INDEX (2)P
        //sb.insert(0,'P');
        //System.out.println(sb);

        //DELETE(strat,end;)
        sb.delete(0,1);
        System.out.println(sb);

        //2 character detlete krna ho jab
        sb.delete(2,4);
        System.out.println(sb);






    }
    

    
}
