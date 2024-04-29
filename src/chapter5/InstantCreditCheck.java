package chapter5;

import java.util.Scanner;

public class InstantCreditCheck {
    static Scanner scanner = new Scanner(System.in);
    static int requiredCreditScore = 700;
    static double leastSalary = 25000;

    public static void main(String[] args) {

        //Initialize what we know
        //Get what we dnt know
        //check if the user is qualified
        //Notify the user

        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();

        boolean qualified = isUserQualified(salary, creditScore);

        notifyUser(qualified);

    }

    public static double getSalary() {
        System.out.println("Enter your current salary");
        double salary = scanner.nextDouble();
        return salary;
    }

    public static int getCreditScore() {
        System.out.println("Enter your credit score");
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    public static boolean isUserQualified(double salary, int creditScore) {
        if (creditScore >= requiredCreditScore && salary >= leastSalary) {
            return true;
        } else {
            return false;
        }
    }

    public static void notifyUser(boolean isQualified) {
        if (isQualified) {
            System.out.println("You are qualified");
        } else {
            System.out.println("Sorry your salary need to be more than " + leastSalary + "$");
        }
    }
}