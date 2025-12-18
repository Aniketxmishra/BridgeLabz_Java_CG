package Week_1.day_1.level_2;
import java.util.Scanner;

public class TravelComputationInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name, fromCity, viaCity, toCity;
        double distanceFromToVia, distanceViaToFinalCity;
        int timeFromToVia, timeViaToFinalCity;

        System.out.print("Enter name: ");
        name = input.nextLine();

        System.out.print("Enter from city: ");
        fromCity = input.nextLine();

        System.out.print("Enter via city: ");
        viaCity = input.nextLine();

        System.out.print("Enter to city: ");
        toCity = input.nextLine();

        System.out.print("Enter distance from source to via (miles): ");
        distanceFromToVia = input.nextDouble();

        System.out.print("Enter distance from via to destination (miles): ");
        distanceViaToFinalCity = input.nextDouble();

        System.out.print("Enter time from source to via (minutes): ");
        timeFromToVia = input.nextInt();

        System.out.print("Enter time from via to destination (minutes): ");
        timeViaToFinalCity = input.nextInt();

        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.println("The Total Distance travelled by " + name +
                " from " + fromCity + " to " + toCity +
                " via " + viaCity + " is " + totalDistance +
                " miles and Total Time taken is " + totalTime + " minutes");
    }
}
