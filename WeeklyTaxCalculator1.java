package weeklytaxcalculator1;

import java.util.Scanner;

public class WeeklyTaxCalculator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weekly income: ");
        double income = scanner.nextDouble();
        double taxRate;

        if (income < 500) {
            taxRate = 0.10;
        } else if (income >= 500 && income < 1500) {
            taxRate = 0.15;
        } else if (income >= 1500 && income < 2500) {
            taxRate = 0.20;
        } else {
            taxRate = 0.30;
        }

        double taxWithholding = income * taxRate;
        System.out.printf("Weekly Tax Withholding: $%.2f%n", taxWithholding);

        scanner.close();
    }
}
