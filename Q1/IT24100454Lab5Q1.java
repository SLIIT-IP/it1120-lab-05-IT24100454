import java.util.Scanner;

public class IT24100454Lab5Q1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first intiger: ");
        int no1 = input.nextInt();
        System.out.print("Enter the second intiger: ");
        int no2 = input.nextInt();
        System.out.print("Enter the third intiger: ");
        int no3 = input.nextInt();

        System.out.println("User entered numbers are : "+no1+" "+no2+" "+no3);
        int smallest = 0;
        if(no2<no3 && no2<no1)
        {
            smallest = no2;
        }
        if(no3<no2 && no3<no1)
        {
            smallest = no3;
        }
        if(no1<no2 && no1<no3)
        {
            smallest = no1;
        }
        System.out.println("The smallest number is: "+smallest);

        int largest = 0;
        if(no2>no3 && no2>no1)
        {
            largest = no2;
        }
        if(no3>no2 && no3>no1)
        {
            largest = no3;
        }
        if(no1>no2 && no1>no3)
        {
            largest = no1;
        }
        System.out.println("The largest number is: "+largest);
    }
}