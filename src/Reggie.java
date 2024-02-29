import java.util.Scanner;

public class Reggie {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String SSN = "";
        String mNum = "";
        String menuChoice = "";

        SSN = SafeInput.getRegExString(in, "Enter your SSN", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your SSN is: " + SSN);

        System.out.println();

        mNum = SafeInput.getRegExString(in, "Enter your UC M number", "(M|m)\\d{5}");
        System.out.println("Your UC M number is: " + mNum);

        System.out.println();

        menuChoice = SafeInput.getRegExString(in, "Enter a menu choice [O,S,V, Q] for Open, Save, View or Quit", "[OoSsVvQq]");
        System.out.println("Your selected: " + menuChoice);


    }
}
