import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0.0;
        double totalPrice = 0.0;
        boolean doneResponse = false;
        do
        {
            itemPrice = SafeInput.getRangedDouble(in, "Enter the price of the item", 0.5, 10.0);
            totalPrice += itemPrice;
            doneResponse = SafeInput.getYNConfirm(in, "Are you done"); // look at SafeInput Table's getYNConfirm method to understand what's happening here

        } while(!doneResponse);
        System.out.printf("Your total cost is %.2f", totalPrice);

    }
}
