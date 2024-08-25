import java.util.Scanner;

public class IT24100454Lab5Q3
{
    public static void main(String[] args)
        {
            final float amount = 48000;
            final int discount10 = 90;
            final int discount20 = 80;

            Scanner hotel = new Scanner(System.in);
            System.out.print("Enter Start Date (1-31): ");
            int date1 = hotel.nextInt();

            System.out.print("Enter End Date (1-31): ");
            int date2 = hotel.nextInt();

            if(date1<1 || date2<1)
                {
                    System.out.println("Error: Days must be between 1 and 31");
                }
            else if(date1>31 || date2>31)
                {
                    System.out.println("Error: Days must be between 1 and 31");
                }
            else if(date1 >= date2)
                {
                    System.out.println("Error: start date must be less than End date");
                }
            else
                {
                    int days = date2-date1;
                    float total = days*48000;

                    if(days<=2)
                    {
                        System.out.println("Room Charge Per Day: Rs. "+amount+"/=");
                        System.out.println("Number of Days Reserved: "+days);
                        System.out.println("Total Amount to be paid: "+total);
                    }
                    else if(days<=4)
                    {
                        
                        System.out.println("Room Charge Per Day: Rs. 48000.0/=");
                        System.out.println("Number of Days Reserved: "+days);
                        total = (total*discount10)/100;
                        System.out.println("Total Amount to be paid: "+total);
                    }
                    else
                    {
                        System.out.println("Room Charge Per Day: Rs. 48000.0/=");
                        System.out.println("Number of Days Reserved: "+days);
                        total = (total*discount20)/100;
                        System.out.println("Total Amount to be paid: "+total);
                    }
                }

        }
}