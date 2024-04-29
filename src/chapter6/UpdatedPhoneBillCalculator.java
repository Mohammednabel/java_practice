package chapter6;

public class UpdatedPhoneBillCalculator {
    public static void main(String[] args) {
        UpdatedPhoneBill phoneBill = new UpdatedPhoneBill(12345);
        phoneBill.setUsedMins(1100);
        phoneBill.printBill();

    }
}
