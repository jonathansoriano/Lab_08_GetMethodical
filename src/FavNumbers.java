import java.util.Scanner;

public class FavNumbers
{
    public static void main(String[] args)
    {
        int favInt = 0;
        double favDouble = 0;
        Scanner in = new Scanner(System.in);

        favInt = SafeInput.getInt(in, "Enter your favorite integer");

        System.out.println("You favorite integer is: " + favInt);
        System.out.println();
        favDouble = SafeInput.getDouble(in, "Enter your favorite double");

        System.out.println("Your favorite double is: " + favDouble);

    }

}