package chapter6;

public class UpdatedPhoneBill {
    //Initialize what we know
    //Get what we dont know
    //Check the
    private int iD;
    private double baseCost;
    private int allottedMins;
    private int usedMins;

    //public static void main(String[] args) {
    public UpdatedPhoneBill() {
        iD = 0;
        baseCost = 79.99;
        allottedMins = 1000;
        usedMins = 800;
    }

    public UpdatedPhoneBill(int iD) {
        this.iD = iD;
        baseCost = 79.99;
        allottedMins = 1000;
        usedMins = 800;
    }

    public UpdatedPhoneBill(int iD, double baseCost, int allottedMins, int usedMins) {
        this.iD = iD;
        this.baseCost = baseCost;
        this.allottedMins = allottedMins;
        this.usedMins = usedMins;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        setiD(iD);
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public int getAllottedMins() {
        return allottedMins;
    }

    public void setAllottedMins(int allottedMins) {
        setAllottedMins(allottedMins);
    }

    public int getUsedMins() {
        return usedMins;
    }

    public void setUsedMins(int usedMins) {
        this.usedMins = usedMins;
    }

    public double calculateOverAge() {

        if (usedMins <= allottedMins) {
            return 0;
        }

        double overageRate = 0.25;
        double overageMinutes = usedMins - allottedMins;
        return overageMinutes * overageRate;
      /*  ;


        double minsFees = mins * chargePerMin;
        double feesAfterTax = minsFees * tax;
        return feesAfterTax; */
    }

  /*  System.out.println("Enter Plan fee");
    Scanner scanner = new Scanner(System.in);
    double planFee =scanner.nextInt();
        System.out.println("Enter number of overage minutes");
    double extraMins= scanner.nextInt();
        scanner.close();

    double overChargeMins = calculateOverAge(extraMins);
    double tax = calculateTax(planFee +overChargeMins);*/

    // printBill(planFee , overChargeMins , tax);
    public double calculateTax() {
        double rate = 0.15;
        return rate * (baseCost + calculateOverAge());
    }

    public double calculateTotal() {
        return baseCost + calculateOverAge() + calculateTax();
    }
        public void printBill(){
            System.out.println("ID: " + iD);
            System.out.println("Base Rate: $" + baseCost);
            System.out.println("Overage Fee: $"
                    + String.format("%.2f", calculateOverAge()));
            System.out.println("Tax: $"
                    + String.format("%.2f", calculateTax()));
            System.out.println("Total: $"
                    + String.format("%.2f", calculateTotal()));
        }

}
