import java.util.Scanner;

public class FindTheNumberOfYears {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //This exercise is about defining a number of minutes, and then make the program calculate and print out how many years is in the minutes and the remaining days after the years have been calculated
        //I Will solve the task in five steps
        //Step one: Declare and assign minutes
        //Step two: Convert the minutes into days
        //Step three: Convert the days into years
        //Step four: Use remainder to calculate how many days are left after the years have ben calculated
        //Step five: Print out the results

        //Step one: Declare and assign minutes
        System.out.println("Coporal Slim, you have measured the proximity of the meteor approaching earth!!! ");
        System.out.print("NOW.... Delare how long time in minutes we have until impact!!!...Minutes = ");
        double minutes = input.nextDouble();

        //Step two: Declare days, convert the minutes into days and assign them to the variable days
        double days = minutes / (60 * 24); //Converting the number of minutes into days

        //Step three: Declare the variable years and convert the variable days into years which will be assigned years
        double years = days / 365;
        double intYears = (int)years;

        //Step four: Calculate the remainder of days after assigning the number of years
        double remDays = days % 365;
        double intRemDays = (int)remDays;

        //Step five: Print out the results
        System.out.println("Time until meteor impact is " + intYears + " years and " + intRemDays + " days ");
    }
}