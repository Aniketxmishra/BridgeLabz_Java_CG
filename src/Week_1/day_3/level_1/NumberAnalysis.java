package Week_1.day_3.level_1;
import java.util.Scanner;
public class NumberAnalysis {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is Positive Even");
                } else {
                    System.out.println(numbers[i] + " is Positive Odd");
                }
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is Negative");
            } else {
                System.out.println("Zero");
            }
        }

        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("First and Last elements are equal");
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("First element is greater");
        } else {
            System.out.println("Last element is greater");
        }

        input.close();
    }
}
