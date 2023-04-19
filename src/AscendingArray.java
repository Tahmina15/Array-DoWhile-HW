import java.util.Scanner;

public class AscendingArray {
//    main method
    public static void main(String[] args) {
        //Create instance of the Scanner Class
        Scanner scanner=new Scanner(System.in);
        int[] array=new int[5]; int temp;
        //take input from the user as requirement
        System.out.println("Enter elements in array ");
        //condition applied to find out array's as an ascending order
        for (int i=0;i<5;i++)
        {

            array[i]= scanner.nextInt();
        }

        for(int i=0;i<5;i++)
        {

            for(int j=i+1;j<5;j++)
            {
                if(array[i]>array[j])
                {
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        for (int i=0;i<5;i++)
        {
            System.out.println(array[i]+"");
        }
    }
}
