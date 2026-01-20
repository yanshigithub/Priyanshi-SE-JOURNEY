import java.util.*;
public class function{

public static void printMyName(String name){
    System.out.println(name);
    return;
}
//INPUT lenge nrml jse lete hai fir function ko call krenge 
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printMyName(name);//call kiya function ko

    }
}

    

