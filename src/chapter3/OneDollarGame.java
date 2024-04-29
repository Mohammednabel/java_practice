package chapter3;

import java.util.Scanner;

public class OneDollarGame {

    public static void main(String[] args) {

        double penniesPrice = 0.25; double nickelsPrice= 0.25;
        double dimesPrice = 0.25; double quartersPrice= 0.25;
        System.out.println("How many pennies would you like?");
        Scanner scanner = new Scanner(System.in);
        int pennies = scanner.nextInt();

        System.out.println("How many nickels would you like?");
        int nickels = scanner.nextInt();

        System.out.println("How many dimes?");
        int dimes = scanner.nextInt();

        System.out.println("how many quarters?");
        int quarters = scanner.nextInt();
        scanner.close();

        double countUp= pennies*penniesPrice + nickels*nickelsPrice + dimes*dimesPrice +quarters * quartersPrice;
        int dollar = 1;
        if (countUp > dollar) {System.out.println("LOSE");}

        else if(countUp ==dollar) {System.out.println("You win");}

        else{System.out.println("you lose");}

    }
}