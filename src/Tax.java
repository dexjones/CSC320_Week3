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
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        double income = 0, rate;
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
        System.out.println(rate);

    }
}