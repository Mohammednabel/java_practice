package chapter3;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        char grade;
        System.out.println("Enter your score");
        Scanner scanner = new Scanner(System.in);
         double score = scanner.nextDouble();

         if (score < 50 ){
             grade = 'F';
         } else if (score <= 65) {
            grade = 'D';
         } else if (score < 75) {
             grade = 'C';
         } else if (score < 85 ) {
             grade = 'B';
         } else {
             grade = 'A';
         }
         System.out.println("Final Grade " + grade);
    }
}
