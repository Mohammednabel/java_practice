package chapter3;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("Enter Your Grade");
        Scanner scanner = new Scanner(System.in);
        String grade =scanner.next();
        String message;

        switch (grade){
            case "A":
                message = "Excellent ";
                break;
            case "B":
                message = "Very Good ";
                break;
            case "C" :
                message = "Good";
                break;
            case "D" :
                message = "Fair";
                break;
            case "F" :
                message = "Failed";
                break;
            default:
                message = "Invalid entry";
                break;
        }
        System.out.println(message);
    }
}
