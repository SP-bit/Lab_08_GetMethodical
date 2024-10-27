public class CtoFTableDisplay
{
    public static void main(String[] args)
    {

        System.out.println("Celsius   Fahrenheit");
        System.out.println("---------------------");


        for (int celsius = -100; celsius <= 100; celsius++)
        {
            System.out.printf("%-10d %-10.2f%n", celsius, CtoF(celsius)); //used google

        }

    }
    public static double CtoF(double celsius)  // used google
    {
        return (celsius * 9 / 5) + 32;
    }
}
