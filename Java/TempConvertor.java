package Java;

import java.util.Scanner;

public class TempConvertor {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("1. Celcuis to Farenheit \n2. Farenheit to Celcius");
        System.out.println("Select One Option : (1/2)");
        int choice = myObj.nextInt();

        if (choice == 1) {
            System.out.println("Enter Celcius Value : ");
            double celcius = myObj.nextDouble();
            System.out.println(
                    "Farenheit Value of " +
                            celcius + " Celcius is "
                            + celciusToFarenheit(celcius) + " Farenheit");
        } else if (choice == 2) {
            System.out.println("Enter Celcius Value : ");
            double farenheit = myObj.nextDouble();
            System.out.println(
                    "Celcius Value of " + farenheit
                            + " Farenheit is " + farenheitToCelcius(farenheit)
                            + " Celcius");

        }

    }

    public static double celciusToFarenheit(double celcius) {
        return (celcius * 9 / 5) + 32;
    }

    public static double farenheitToCelcius(double farenheit) {
        return (farenheit - 32) * 5 / 9;
    }
}
