package Week_1.day_1.level_2;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double principal, rate, time;

        System.out.print("Enter principal: ");
        principal = input.nextDouble();

        System.out.print("Enter rate of interest: ");
        rate = input.nextDouble();

        System.out.print("Enter time: ");
        time = input.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("The Simple Interest is " + simpleInterest +
                " for Principal " + principal +
                ", Rate of Interest " + rate +
                " and Time " + time);
    }
}
