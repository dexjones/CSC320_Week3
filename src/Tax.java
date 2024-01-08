/*
Written by Dexter Jones
Date: 1/7/2024

Psuedocode:
A program that will calculate the weekly average tax withholding for a customer given the following weekly income
guidelines:
Income less than $500: tax rate 10%
Income greater than/equal to $500 and less than $1500: tax rate 15%
Income greater than/equal to $1500 and less than $2500: tax rate 20%
income greater than/equal to $2500: tax rate 30%

User input: weekly income

Output: tax rate

Tax rate class: returns calculated tax rate (has guidelines for calculation)
Withholdiong class: returns the calculated withheld taxes from weekly income

User input validation: Ask for a string, try-catch to make sure input is number


 */
import java.util.*;
public class Tax {
    public static double taxRate(double income) {
        double rate;
        if (income < 500) {
            rate = 0.1;
        }
        else if (income >= 500 && income < 1500) {
            rate = .15;
        }
        else if (income >= 1500 && income < 2500) {
            rate = .2;
        }
        else {
            rate = .3;
        }
        return rate;
    }
    public static double avgTax(double income, double rate) {
        double avg;
        avg = income * rate;

        return avg;
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        double income = 0, rate, withholding;
        String s;
        boolean isNumber = false;
        System.out.println("Enter weekly income: $");
        s = scnr.nextLine();

        while (!isNumber) {
            try {
                income = Double.parseDouble(s);
                isNumber = true;
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid entry. Please enter a number for weekly income: $");
                s = scnr.nextLine();
            }
        }
        rate = taxRate(income);
        withholding = avgTax(income, rate);

        System.out.println("The tax rate is %" + (rate*100) + " and the weekly average tax withholding is $" + withholding);

    }
}