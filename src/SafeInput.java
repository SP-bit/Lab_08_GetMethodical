import java.util.Scanner;
public class SafeInput
{
    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = ""; // Set this to zero length. Loop runs until it isn't
        do
        {
            System.out.print("\n" +prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        }while(retString.length() == 0);

        return retString;

    }
    public static int getInt(Scanner pipe, String prompt)
    {
        int userInput = 0;
        boolean valid = false;
        String trash = "";
        while (!valid) {

            System.out.print(prompt + ": ");
            if (pipe.hasNextInt()) {
                userInput = pipe.nextInt();
                pipe.nextLine();
                valid = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("\nYou entered: " + trash);
                System.out.println("You have to enter a valid integer!");
            }
        }
        return userInput;
    }

}
