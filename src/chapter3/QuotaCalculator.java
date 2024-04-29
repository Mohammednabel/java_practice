package chapter3;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {

        int salesPeople = 10;

        System.out.println("enter sales numbers");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if (sales >= salesPeople) {
            System.out.println("Congratulation");
        }
        else{
            int salesShort = salesPeople - sales;
            System.out.println("You didn't make your quota. you were " + salesShort + " sales short");
        }

    }
}