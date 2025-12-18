package Week_1.day_1.level_2;
import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double fahrenheit;

        System.out.print("Enter temperature in Fahrenheit: ");
        fahrenheit = input.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("The " + fahrenheit + " fahrenheit is " + celsius + " celsius");
    }
}
