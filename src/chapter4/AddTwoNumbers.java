package chapter4;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        double sum;
        boolean again;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("Enter the first number to start summing");
            double firstNumber = scanner.nextDouble();
            System.out.println("Enter the second number");
            double secondNumber = scanner.nextDouble();
            sum = firstNumber + secondNumber;
            System.out.println("The sum of " +firstNumber + " and " +secondNumber + " is "+sum);
            System.out.println("do you want start over");
            again= scanner.nextBoolean();
        }
        while (again);
        scanner.close();
    }
}
