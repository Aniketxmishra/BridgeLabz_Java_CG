package Week_1.day_2.level_1;
import java.util.Scanner;

public class NaturalSumFor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number > 0) {
            int sumFor = 0;

            for (int i = 1; i <= number; i++) {
                sumFor += i;
            }

            int sumFormula = number * (number + 1) / 2;

            System.out.println("Sum using for loop: " + sumFor);
            System.out.println("Sum using formula: " + sumFormula);
        }

        input.close();
    }
}
