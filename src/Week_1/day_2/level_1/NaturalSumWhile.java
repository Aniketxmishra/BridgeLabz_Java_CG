package Week_1.day_2.level_1;
import java.util.Scanner;

public class NaturalSumWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number > 0) {
            int sumWhile = 0;
            int i = 1;

            while (i <= number) {
                sumWhile += i;
                i++;
            }

            int sumFormula = number * (number + 1) / 2;

            System.out.println("Sum using while loop: " + sumWhile);
            System.out.println("Sum using formula: " + sumFormula);
        }

        input.close();
    }
}
