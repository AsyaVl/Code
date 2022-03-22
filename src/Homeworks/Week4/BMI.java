package Homeworks.Week4;

public class BMI {
    public static void main(String[] args) {
        int weight = 63;
        float height = 1.80f;
        double myBMI = weight / Math.pow(height, 2);

        System.out.println(myBMI);
    }

}
