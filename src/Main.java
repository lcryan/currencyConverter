import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //takes the users input here.
        boolean continueConversion = true;

        while (continueConversion) {
            //Step 1. of the UI display! The user needs to see what he can choose from!
            printConversionChoice();
            //Step 2. the user makes a choice and then with the help of the scanner, so we can lead him to the next step - entering the amount of money he wants to exchange
            int choice = scanner.nextInt();
// Step  3: User has to be able to make a choice: we need to get the conversionRate as the user's choice. This should be a double!
            double conversionRate = getConversionRate(choice);
            //Step 4: now the user has to be able to enter the amount of his chosen currency - pack it in  String - one from and one to
            // Step 4:  write the method for this one
            String currencyFrom = getCurrencyFrom(choice);
            String currencyTo = getCurrencyTo(choice);// Step 5: write the method for this one as wel
            //Step 6: make the choice visible for the user and include the methods in this line as well
            System.out.println("Please enter the amount of " + getCurrencyFrom(choice) + ": ");
            double amountFrom = scanner.nextDouble(); //Step 7:scanner takes in the amount that the users;
            //Step 8. Rate has to be calculated into a variable (saved to a variable)
            double amountTo = calculateAmountTo(amountFrom, conversionRate);
            //Step 9.: Display the results to user - this has to be packed in a method below and then called on here !
            displayConversionResult(amountFrom, amountTo, currencyFrom, currencyTo);
//Step 10: Ask the user, if he wants to go on calculating exchange Rates//
            System.out.println("Do you want to make another conversion? Please enter y or n!");
            //scan user answer
            String userAnswer = scanner.next();
            // stop if answer is no - put in if else statement!
            if (!userAnswer.equalsIgnoreCase("y")) {
                continueConversion = false;
            }
        }
        System.out.println("Thank you for using our awesome service. Make sure to visit us again very soon.");
    }

    private static void printConversionChoice() {
        System.out.println("Please choose your conversion preference here: ");
        System.out.println("Enter 1: Euro to Dollar");
        System.out.println("Enter 2: Dollar to Euro");
        System.out.println("Enter 3: Yen to Euro");
        System.out.println("Enter 4: Euro to Yen");
        System.out.println("Enter 5: Euro to Renminbi Yuan");
        System.out.println("Enter 6: Renminbi Yuan to Euro");
    }

    private static double getConversionRate(int choice) {
        switch (choice) {
            case 1 -> {
                return 0.91;
            }
            case 2 -> {
                return 1.19;
            }
            case 3 -> {
                return 0.0068;
            }
            case 4 -> {
                return 147.96;
            }
            case 5 -> {
                return 7.60;
            }
            case 6 -> {
                return 0.13;
            }
            default -> {
                System.out.println("Please enter a valid number from 1-6.");
                return 0;
            }
        }
    }

    private static String getCurrencyFrom(int choice) {
        return switch (choice) {
            case 1 -> "Euros";
            case 2 -> "Dollars";
            case 3 -> "Yen";
            case 4 -> "Euros";
            case 5 -> "Euros";
            case 6 -> "Renminbi Yuan";
            default -> "";
        };
    }

    private static String getCurrencyTo(int choice) {
        return switch (choice) {
            case 1 -> "Dollars";
            case 2 -> "Euros";
            case 3 -> "Euros";
            case 4 -> "Yen";
            case 5 -> "Renminbi Yuan";
            case 6 -> "Euros";
            default -> "";
        };
    }

    private static double calculateAmountTo(double amountFrom, double conversionRate) {
        return amountFrom * conversionRate;
    }

    private static void displayConversionResult(double amountFrom, double amountTo, String currencyFrom, String currencyTo) {
        System.out.println("Your given amount of " + amountFrom + " " + currencyFrom + " is " + Math.round(amountTo * 100.0) / 100.0 + " " + currencyTo + ".");
    }
}









