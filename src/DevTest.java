import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int result = SafeInput.getRangedInt(in, "Enter your birth month", 1,12);
        System.out.println("Your birth month is: " + result);
    }
}
