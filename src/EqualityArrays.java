import java.util.Arrays;
import java.util.Scanner;

public class EqualityArrays {
    //Declare the Main method
    public static void main(String[] args) {
        //Create instance of the Scanner Class

        Scanner sc = new Scanner(System.in);
        //Take input from the user as requirements
        System.out.println("enter the size of array1");

        int size1 = sc.nextInt();

        int [] array1 = new int[size1];

       //
        for(int i = 0; i <size1; i++){

            System.out.println("enter the elements of array1");
            array1[i]= sc.nextInt();
        }

            System.out.println("ArrayOne :" +Arrays.toString(array1)); // printing elements of ArrayOne

        System.out.println("enter the size of array2");
        int size2 = sc.nextInt();
        int [] array2 = new int[size2];

        for(int j = 0; j <size2; j++){

            System.out.println("enter the elements of array2");
            array2[j]= sc.nextInt();
        }

            System.out.println("ArrayTwo:"+Arrays.toString(array2)); // printing elements of ArrayOne


        if(array1.length == array2.length){    // prove the equality if else condition
            System.out.println("Arrays are equal");
        }
        else {
            System.out.println("Arrays are not equal");
        }
    }
}


