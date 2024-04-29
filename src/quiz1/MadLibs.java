package quiz1;

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {

        //Create a program that asks a user for a season of the year, then a whole number, then an adjective.
       // And use the input to complete the sentence below. Output the result

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the season of the year");
        String seasonOfTheYear = scanner.next();

        System.out.println("Enter the whole number of cups");
        int wholeNumber = scanner.nextInt();

        System.out.println("Enter an adjective");
        String adjective = scanner.next();

        scanner.close();

        System.out.println("On a " + adjective + " " + seasonOfTheYear + " day, I drink a minimum of " + wholeNumber + " cups of coffee");

    }
}
