import java.util.*;
public class D2arrayM {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int column = sc.nextInt();
        

        int[][] numbers = new int[rows][column];

        //imput
        //rows
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<column ;j++){
            numbers[i][j] = sc.nextInt();
            }
        }
        //output
        int x = sc.nextInt();
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<column ;j++){
            if(numbers[i][j] == x)
            {
            System.out.println("x found in index no.  ("  + i +" , " + j  +")");
    
            }
            
        }

    }
    }
}
