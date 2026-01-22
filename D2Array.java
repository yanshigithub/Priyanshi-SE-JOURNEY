import java.util.*;
public class D2Array {
    public static void main(String[]ARGS)
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
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<column ;j++){
            System.out.print(numbers[i][j] + " ");
    
            }
            System.out.println();
        }
    }
}