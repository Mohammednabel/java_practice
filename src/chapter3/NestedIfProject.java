package chapter3;

import java.util.Scanner;

public class NestedIfProject {
    public static void main(String[] args) {
        int requiredSalary = 30000;
        int requiredYears = 2;

        System.out.println("Enter your salary");
        Scanner scanner = new Scanner(System.in);
        Double salary = scanner.nextDouble();
        System.out.println("Enter The Years you have worked");
        Double workedYears = scanner.nextDouble();
        scanner.close();

        if (salary >= requiredSalary) {
            if (workedYears >= requiredYears) {
                System.out.println("congrats, You are eligible");
            }
            else {
                System.out.println("You need to work at least " + requiredYears +" years");
            }
        }
            else {
            System.out.println("Your Salary need to be more than $" + requiredSalary);
        }
    }
}

