import java.util.Arrays;
import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args)
          { //Create instance of the Scanner Class
            Scanner scanner=new Scanner(System.in);
              //take input from the user as requirement
            System.out.println("Please enter number of rows");
            int rows=scanner.nextInt();
            System.out.println("Please enter number of columns");
            int colum=scanner.nextInt();
            //Creating transpose & matrix object
            int[][] matrix=new int [rows][colum];
            int[][] transpose=new int[colum][rows];

            System.out.println("Enter the data to create the transpose matrix :");
            for(int i=0;i<rows;i++)
            {for(int j=0;j<colum;j++)
            {
                    matrix[i][j] = scanner.nextInt();
            }
            }
            System.out.println("Create the input matrix:");
            for(int i =0;i<rows;i++){
                for(int j=0;j<colum;j++){
                    System.out.println(matrix[i][j]+" ");
                }
                System.out.println();
            }
            for(int i =0;i<rows;i++){
                for(int j=0;j<colum;j++){
                    transpose[j][i]=matrix[i][j];
                }}
            System.out.println("Print the transpose matrix:");
            for(int[]r:transpose)
                System.out.println(Arrays.toString(r));
             }
         }
