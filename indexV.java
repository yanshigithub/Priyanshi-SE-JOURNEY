import java.util.*;
public class indexV {
public static void main(String[] args) {
       // int marks[] = {97,98,94,95}
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       int numbers[] = new int[size];
       //input
      for (int i=0;i<size;i++){
            numbers[i]= sc.nextInt();
      }
      //output
      int x = sc.nextInt();

       for (int i=0;i<numbers.length;i++){
        if(numbers[i] == x){
        System.out.println("x found at index :" + i);
       }
    }

}
} 

