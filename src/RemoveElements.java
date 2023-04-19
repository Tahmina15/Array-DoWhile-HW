import java.util.Scanner;

public class RemoveElements {
    public static void copyArray(int []array1,int array2[],int element)
    {
        for(int i=0;i<5;i++)
        {
            if (array1[i]!=element)
            {
                array2[i]=array1[i];
            }
            for(int j:array2)
            {
                System.out.println(j);
            }
        }

    }
    //Declaring main method
    public static void main(String[] args) {
        //Create instance of the Scanner Class
        Scanner scanner=new Scanner(System.in);
        int []array1=new int[5];
        int []array2=new int[5];
        //using for loop
        for (int i =0;i<5;i++)
        {   //Enter any numbers
            System.out.println("Enter Elements : ");
            array1[i]=scanner.nextInt();
        }//select any specific numbers from input to remove
        System.out.println("Which Element do you wanna remove: ");
        int element= scanner.nextInt();
        System.out.println("The original array is :");
        for(int k:array1)
        {
            System.out.println(k);
        }
        System.out.println("The new array is :");
        copyArray(array1,array2,element);

    }


}
