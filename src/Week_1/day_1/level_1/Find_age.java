package Week_1.day_1.level_1;

public class Find_age {

    public static void main(String[] args) {

        String name = "Harry";
        int birthYear = 2000;
        int currentYear = 2024;

        int age = currentYear - birthYear;

        System.out.println(name + "'s age in " + currentYear + " is " + age);
    }
}
