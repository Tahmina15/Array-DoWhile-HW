import java.util.Scanner;

public class NumberDividation{
    //main method
    public static void main(String[] args) {
        //Using scanner class for user input feasibility
        Scanner scanner =new Scanner(System.in);
        //enter the text and acknowledge the user what to do
        System.out.println("Enter number 1 to 100 which can be divided by 3 and 5 separately ");
        int num = scanner.nextInt();
        System.out.println("Numbers divided by 3");
        //Find out the number which is divided by 3
        for (int i = 1; i <=num; i++) {
            if(i%3==0)
                System.out.println(i+",");}
        System.out.println("numbers divided by 5");
        //Find out the number which is divided by 5
        for (int j = 1; j <=num; j++) {
            if(j%5==0)
                System.out.println(j+",");}
        System.out.println("Numbers divided by 3 & 5");
        //Find out the number which is divided by 3 & 5
        for (int i = 0; i <=num ; i++) {
            if(i%3==0 && i%5==0)
                System.out.println(i+",");

        }

    }
}



