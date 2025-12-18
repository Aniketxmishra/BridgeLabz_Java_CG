package Week_1.day_2.level_1;
import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int factorial = 1;

        if (number > 0) {
            int i = 1;
            while (i <= number) {
                factorial *= i;
                i++;
            }
            System.out.println("Factorial is " + factorial);
        }

        input.close();
    }
}
