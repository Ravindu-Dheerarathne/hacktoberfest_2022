package Java;

import java.util.Scanner;

public class TimeValueOfMoney {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Welcome to Time Value of Money Calculator ");
        System.out.println("Future Value of Money (FVIF)");
        System.out.println("Present Value of Money (PVIF)");
        System.out.println("Select an option to calculate : (FVIF/PVIF) ");

        String choice = myObj.nextLine();

        if (choice.toLowerCase().equals("fvif")) {
            System.out.println("Enter Present Sum to invest : ");
            double presSum = myObj.nextDouble();
            System.out.println("Enter discount interest rate : ");
            double discountRate = myObj.nextInt();
            System.out.println("Enter the time period in Years");
            int years = myObj.nextInt();

            System.out.println("FVIF Value is : "
                    + fvif(presSum, discountRate, years));

        } else if (choice.toLowerCase().equals("pvif")) {
            System.out.println("Enter Future Sum to be recieved : ");
            double futureSum = myObj.nextDouble();
            System.out.println("Enter discount interest rate : ");
            double discountRate = myObj.nextInt();
            System.out.println("Enter the time period in Years");
            int years = myObj.nextInt();

            System.out.println("PVIF Value is : "
                    + pvif(futureSum, discountRate, years));
        } else {
            System.out.println("Wrong Input");
        }

    }

    public static double fvif(double presSum, double discountRate, int years) {
        double fvif = presSum * Math.pow((1 + (discountRate / 100)), years);
        return fvif;
    }

    public static double pvif(double futureSum, double discountRate, int years) {
        double pvif = futureSum * Math.pow(1 / (1 + (discountRate / 100)), years);
        return pvif;
    }
}
