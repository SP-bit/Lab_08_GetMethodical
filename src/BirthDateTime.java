import java.util.Scanner;
public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int birthYear = SafeInput.getRangedInt(in,"Enter your birth year", 1950,2015);
        int birthMonth = SafeInput.getRangedInt(in,"Enter your birth month", 1,12);
        int birthDay = 0;
        if (birthMonth  == 2)
        {
            birthDay = SafeInput.getRangedInt(in, "Enter your birth day (1-28)", 1, 28);
        } else if (birthMonth == 4 || birthMonth == 6 || birthMonth == 9 || birthMonth == 11) {
            birthDay = SafeInput.getRangedInt(in, "Enter your birth day (1-30)", 1, 30);
        } else {
            birthDay = SafeInput.getRangedInt(in, "Enter your birth day (1-31)", 1, 31);
        }
        int birthHour = SafeInput.getRangedInt(in, "Enter your birth hour", 1,24);
        int birthMinute = SafeInput.getRangedInt(in,"Enter your birth minute",0,59);
        System.out.println("Your birth year is: " + birthYear);
        System.out.println("Your birth month is: " + birthMonth);
        System.out.println("Your birth day is: " + birthDay);
        System.out.println("Your birth hour is: " + birthHour);
        System.out.println("Your birth minute is: " + birthMinute);

    }
}
