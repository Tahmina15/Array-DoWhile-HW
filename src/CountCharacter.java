import java.util.Scanner;

public class CountCharacter {
    //Main method
    public static void main(String[] args){
        //Create instance of the Scanner Class
        Scanner scanner=new Scanner(System.in) ;
        //take input from the user as requirement
        System.out.println("Enter a String to count number of character");
        String str=scanner.nextLine();
        //initialize the number
        int count =0;
        //using foreach loop
        for(char ch:str.toCharArray())
        //putting condition

        {  if(ch=='a'||ch=='A')
            {
              count++;
            }
        }
        //printing the total number of A from the string
        System.out.println("Total number of A is : "+count);


    }

}
