package Homeworks.Week4;

public class SpringSeason {
    public static void main(String[] args) {
        int day = 20;
        int month = 8;
        String isSpring = (month >= 4 && month <= 5) || (month == 3 && day >= 20) || (month == 6 && day <= 20) ? "yes" : "false";
        System.out.println(isSpring);
    }
}
