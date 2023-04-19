import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {


        //Create instance of the Scanner Class
        Scanner sc = new Scanner(System.in);
        //Take input from the user as requirements
        System.out.println("Enter the first number :"); // user need to enter 1

        int n = sc.nextInt();
        System.out.println("Enter the second number:"); // user need to enter 2
        int n1 = sc.nextInt();
        System.out.println("Enter the third number:"); // user need enter 3
        int n2 = sc.nextInt();

        //Declare and initialize the number
        int i = 1;

        //Infinite Loop Example
        do {
            System.out.println(n * i + " " + n1 * i + " " + n2 * i);  // output for multiplication table

            i++;
        } while (i <= 3);
    }
}