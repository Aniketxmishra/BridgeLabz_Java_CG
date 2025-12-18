package Week_1.day_1.level_2;

import java.util.Scanner;

class PoundsToKilograms {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double weightInPounds;

        System.out.print("Enter weight in pounds: ");
        weightInPounds = input.nextDouble();

        double weightInKg = weightInPounds / 2.2;

        System.out.println("The weight of the person in pound is " +
                weightInPounds + " and in kg is " + weightInKg);
    }
}
