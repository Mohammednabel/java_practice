package chapter4;

import java.util.Scanner;

public class GrossSalaryCalculator {
    public static void main(String[] args) {
        int hourSalary= 15;
        int maxHours= 40;

        System.out.println("Enter your working hours");
        Scanner scanner = new Scanner(System.in);
        double workedHours= scanner.nextDouble();

        while (workedHours>maxHours || workedHours< 1 ){
            System.out.println("invalid inputs number should be between 1 to 40");
            workedHours =scanner.nextDouble();

        }
        scanner.close();
        double gross = hourSalary * workedHours;
        System.out.println("Your salary is " + gross +"$");
    }
}
