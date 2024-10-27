import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String result = SafeInput.getNonZeroLenString(in, "Enter a non-empty string");
        System.out.println("You entered: " + result);
    }
}
