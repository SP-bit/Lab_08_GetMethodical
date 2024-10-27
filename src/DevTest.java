import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        double result = SafeInput.getRangedDouble(in, "Enter the gas price", 1,7);
        System.out.println("Your gas price is: " + result);
    }
}
