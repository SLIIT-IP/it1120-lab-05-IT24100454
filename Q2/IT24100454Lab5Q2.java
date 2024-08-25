import java.util.Scanner;

public class IT24100454Lab5Q2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of new members introduced: ");
        int new_mem_count = input.nextInt();
        System.out.println();

        if(new_mem_count < 0)
        {
            System.out.println("Input must be a number 0 or greater");
            System.exit(0);
        }
        switch(new_mem_count)
        {
            case 0:
                System.out.println("No Price");
                break;
            case 1:
                System.out.println("Price is a : Pen");
                break;
            case 2:
                System.out.println("Price is an : Umbrella");
                break;
            case 3:
                System.out.println("Price is a : Bag");
                break;
            case 4:
                System.out.println("Price is a : Travelling Chair");
                break;
        }
        if(new_mem_count >= 5)
        {
            System.out.println();
            System.out.println("Price is a : Headphone");
        }
    }
}