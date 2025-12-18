package Week_1.day_3.level_1;
import java.util.Scanner;
public class MultiplicationTableSixToNine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int[] results = new int[4];
        int index = 0;

        for (int i = 6; i <= 9; i++) {
            results[index] = number * i;
            System.out.println(number + " * " + i + " = " + results[index]);
            index++;
        }

        input.close();
    }
}
