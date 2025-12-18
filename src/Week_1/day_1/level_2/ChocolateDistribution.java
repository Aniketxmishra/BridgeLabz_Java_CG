package Week_1.day_1.level_2;
import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numberOfChocolates;
        int numberOfChildren;

        System.out.print("Enter number of chocolates: ");
        numberOfChocolates = input.nextInt();

        System.out.print("Enter number of children: ");
        numberOfChildren = input.nextInt();

        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        System.out.println("The number of chocolates each child gets is " +
                chocolatesPerChild +
                " and the number of remaining chocolates are " + remainingChocolates);
    }
}
