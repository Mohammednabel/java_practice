package chapter6;

public class Month {

    public static int getMonth(String month){
        switch (month){
            case "Jan": return 1;
            case "Feb": return 2;
            case "Mar": return 3;
            default: return -1;
        }
    }
    public static String getMonth(int month){
        switch (month){
            case 1 : return "Jan";
            case 2 : return "Feb";
            case 3 : return "Mar";
            default: return "Wrong input";
        }
    }
}
