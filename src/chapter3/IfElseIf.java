package chapter3;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        int grade1 = 75 ;
        int grade2 = 60 ;

        System.out.println("Enter your score");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        scanner.close();

        if (score >= grade1) {
            System.out.println("Your grade is A");
        }
        else if (score <= grade1) {
                System.out.println("Your grade is B");
        }
        else {
            System.out.println("Your grade is C");
        }
    }
}
