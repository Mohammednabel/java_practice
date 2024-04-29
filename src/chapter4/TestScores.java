package chapter4;

import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        int noOfStudents = 24; int noOfTests=4;
        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<noOfStudents;i++){
            double total = 0;
            for (int j=0; j<noOfTests;j++){
                System.out.println("Enter your score #" + (j+1));
                double score= scanner.nextDouble();
                total = total + score;
            }
            double avg=total/noOfTests;
            System.out.println("Your Avg score of student #" + (i+1) + " is " + avg);
        }
        scanner.close();
    }
}
