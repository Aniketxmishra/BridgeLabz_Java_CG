package Week_1.day_1.level_1;

public class KmtoMiles {

    public static void main(String[] args) {

        double kilometers = 10.8;
        double conversionFactor = 1.6;

        double miles = kilometers * conversionFactor;

        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}
