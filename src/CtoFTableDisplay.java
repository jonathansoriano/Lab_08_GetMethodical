import java.util.Scanner;
//Disregard Code. Couldn't figure out how to get Celsius and Fahren table
public class CtoFTableDisplay {
    public static double CtoF(Scanner pipe, String prompt){ //Disregard this code... couldn't figure out how to make table...

        double retTempF = 0;
        double tempC = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print("\n" + prompt);

            if (pipe.hasNextDouble()) {
                tempC = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("You have entered: " + trash);
                System.out.println("Please enter a valid number and try again!");
                System.out.print("Enter the temperature in Celsius: ");
            }
        } while (!done);

        retTempF = (tempC * 9.0 / 5.0) + 32.0;
        return retTempF;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double fahrenTemp = 0.0;

        fahrenTemp = CtoF(in, "Enter your temp: ");


        System.out.println("This is the temp in Fahrenheit: " + fahrenTemp);


    }
}
