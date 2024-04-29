package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {

    //Initialize what we know
    //Get what we dont know
    //Check the
    public static void main(String[] args) {
        System.out.println("Enter Plan fee");
        Scanner scanner = new Scanner(System.in);
        double planFee =scanner.nextInt();
        System.out.println("Enter number of overage minutes");
        double extraMins= scanner.nextInt();
        scanner.close();

        double overChargeMins = calculateOverAge(extraMins);
        double tax = calculateTax(planFee +overChargeMins);

        printBill(planFee , overChargeMins , tax);

    }
    public static double calculateOverAge(double extraMins) {

        double rate = 0.25;
        double overage= extraMins * rate;
        return overage;
      /*  ;


        double minsFees = mins * chargePerMin;
        double feesAfterTax = minsFees * tax;
        return feesAfterTax; */
    }
    public static double calculateTax(double subTotal){
        double rate=0.15;
        double tax = subTotal * rate;
        return tax;
    }
    public static void printBill(double planFee,double tax, double overage){
        double finalTotal = planFee + tax + overage;

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + String.format("%.2f", planFee));
        System.out.println("Overage: $" + String.format("%.2f", overage));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", finalTotal));
    }
}
