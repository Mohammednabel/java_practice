package chapter6;

import java.util.Scanner;

public class HomeAreaRedo {
    private final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        HomeAreaRedo calculator=new HomeAreaRedo();

        Rectangle kitchen =calculator.getRoom();
        Rectangle bathroom =calculator.getRoom();

        double area = calculator.calculateTotalArea(kitchen,bathroom);
        System.out.println("Your Total Area is " + area);
        calculator.scanner.close();
    }

    public Rectangle getRoom(){
        System.out.println("Enter room Length");
        double length=scanner.nextDouble();
        System.out.println("Enter room Width");
        double width=scanner.nextDouble();
        return new Rectangle(length,width);

    }
    public double calculateTotalArea(Rectangle rectangle1,Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}