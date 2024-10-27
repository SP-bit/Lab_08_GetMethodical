import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        boolean result = SafeInput.getYNConfirm(in, "Are you under 18");
        System.out.println("You said: " + result);
    }
}
