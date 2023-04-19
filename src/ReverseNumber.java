import java.util.Scanner;

public class ReverseNumber {
    //main method
    public static void main(String[] args) {
        //declaring variables
        int num = 0;
        //creating scanner to read user input
        Scanner scanner = new Scanner(System.in);
        //acknowledge user what to enter
        System.out.println("Enter a number you want to reverse: ");
        int reverse = scanner.nextInt();
        //using loop to reverse number

        for (; reverse != 0; ) {

            num = num * 10;
            num = num + reverse % 10;
            reverse = reverse / 10;

        }
        if (num <= 99999) //putting condition
            if (num >= 10000) {
                System.out.println("Reversed number of the input is: " + num);//command to print expected result
            } else {
                System.out.println("Invalid");
            }
       }
   }