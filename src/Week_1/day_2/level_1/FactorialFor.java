package Week_1.day_2.level_1;
import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int factorial = 1;

        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("Factorial is " + factorial);
        }

        input.close();
    }
}
