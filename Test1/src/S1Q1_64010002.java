import java.util.Scanner;
import java.util.Random;

public class S1Q1_64010002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Size of Matrix : ");
        int size = input.nextInt();
        int[][] matrix = new int[size][size];

        Random rand = new Random();
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                matrix[i][j] = rand.nextInt(10);
                //matrix[i][j] = input.nextInt();
            }
        }

        System.out.println("Random matrix is :");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
            System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }

        System.out.println("Please input value of row and column : ");
        int row = input.nextInt();
        int column = input.nextInt();
        
        System.out.println("The selected member is : "+matrix[row][column]);

        System.out.print("(i) Member on top : ");
        if(row>0){
            for(int i=0;i<row;i++){
                System.out.print(matrix[i][column]+" ");
            }
        }
        else System.out.print(" No ");

        System.out.println();

        System.out.print("(ii) Member on the right hand side : ");
        if(column<size-1){
            for(int i=column+1;i<size;i++){
                System.out.print(matrix[row][i]+" ");
            }
        }
        else System.out.print(" No ");

        System.out.println();

        System.out.print("(iii) Member at the bottom : ");
        if(row<size-1){
            for(int i=row+1;i<size;i++){
                System.out.print(matrix[i][column]+" ");
            }
        }
        else System.out.print(" No ");

        System.out.println();

        System.out.print("(vi) Member on the left hand side : ");
        if(column>0){
            for(int i=0;i<column;i++){
                System.out.print(matrix[row][i]+" ");
            }
        }
        else System.out.print(" No ");
        System.out.println();

        System.out.println("End of Program");
        input.close();
    }
}
