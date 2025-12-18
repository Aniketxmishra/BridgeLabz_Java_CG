package Week_1.day_1.level_2;
import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double celsius;

        System.out.print("Enter temperature in Celsius: ");
        celsius = input.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("The " + celsius + " celsius is " + fahrenheit + " fahrenheit");
    }
}
