import java.util.Scanner;

public class ArmstrongNumber {
    //main method
    public static void main(String[] args) {

        int num, number, temp, total = 0;
        System.out.println("Enter 3 Digit Number");
        //Create instance of the Scanner Class
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        scanner.close();
        number = num;
        //Method to use to identify Armstrong number

        for( ;number!=0;number /= 10)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
        }
       //condition applied
        if(total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }


}
