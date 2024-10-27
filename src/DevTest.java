import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String pattern = ".*";
        String result = SafeInput.getRegExString(in, "Enter any string", pattern);
        System.out.println("You said: " + result);
    }
}
