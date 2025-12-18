package Week_1.day_1.level_1;
import java.util.Scanner;

public class FeetToYardMile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double distanceInFeet;

        System.out.print("Enter distance in feet: ");
        distanceInFeet = input.nextDouble();

        double yards = distanceInFeet / 3;
        double miles = yards / 1760;

        System.out.println("Distance in yards is " + yards +
                " and distance in miles is " + miles);
    }
}
