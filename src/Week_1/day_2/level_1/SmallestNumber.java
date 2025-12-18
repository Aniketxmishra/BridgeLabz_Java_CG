package Week_1.day_2.level_1;
import java.util.Scanner;

public class SmallestNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1, number2, number3;

        number1 = input.nextInt();
        number2 = input.nextInt();
        number3 = input.nextInt();

        boolean isSmallest = (number1 < number2 && number1 < number3);

        System.out.println("Is the first number the smallest? " + isSmallest);

        input.close();
    }
}
