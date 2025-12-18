package Week_1.day_1.level_1;
import java.util.Scanner;

public class FeeDiscountInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double fee;
        double discountPercent;

        System.out.print("Enter course fee: ");
        fee = input.nextDouble();

        System.out.print("Enter discount percent: ");
        discountPercent = input.nextDouble();

        double discountAmount = fee * discountPercent / 100;
        double finalFee = fee - discountAmount;

        System.out.println("The discount amount is INR " + discountAmount +
                " and final discounted fee is INR " + finalFee);
    }
}
