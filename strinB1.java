import java.util.*;
public class strinB1 {
    public static void main(String [] args)
    {
        StringBuilder sb = new  StringBuilder("yanshi");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(2));

        //set char at index 0
        sb.setCharAt(0,'A');
        System.out.println(sb);

    }
    
}
