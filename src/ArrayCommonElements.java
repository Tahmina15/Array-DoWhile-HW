import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;


public class ArrayCommonElements {
    public static void main(String[] args) {
        // creating object of 2 arrays
        String[] arrOne = new String[3];
        String[] arrTwo = new String[3];
        int i, j;
        Scanner s = new Scanner(System.in);
        //take 3 String input
        System.out.println("Enter 3 elements for the first array: ");
        for (i = 0; i < 3; i++)  // for loop
            arrOne[i] = s.nextLine();
        System.out.println("ArrayOne:" + Arrays.toString(arrOne));  // printing ArrayOne

        // take 3 String input
        System.out.println("\nEnter 3 elements for the second array: ");
        for (j = 0; j < 3; j++)
            arrTwo[j] = s.nextLine();
        System.out.println("ArrayTwo" + Arrays.toString(arrTwo));  // printing ArrayTwo


        System.out.println("\nCommon elements are:");  // finding common string value using for loop

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (Objects.equals(arrOne[i], arrTwo[j]))
                    System.out.print(arrOne[i] + " ");

            }


        }
           }
        }


