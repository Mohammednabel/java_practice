package chapter6;

public class HomeArea {
    public static void main(String[] args) {
        Rectangle room1= new Rectangle();
        room1.setWidth(5);
        room1.setLength(6);
        double areaRoom1 = room1.calculateArea();

        Rectangle room2=new Rectangle(7,10);
        double areaRoom2 = room2.calculateArea();

        double totalArea= areaRoom1 + areaRoom2;
        System.out.println("Your home area " + totalArea +"m^2");
    }
}
