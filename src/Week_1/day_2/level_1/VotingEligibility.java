package Week_1.day_2.level_1;
import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int age;
        age = input.nextInt();

        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        input.close();
    }
}
