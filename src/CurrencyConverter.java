import com.sun.tools.javac.Main;

import java.util.Scanner;

public class CurrencyConverter {
    public static void Main(String[] args) {
        Scanner scanner = new Scanner(System.in); //takes the users input here.
        boolean continueConversion = true;

        while (continueConversion) {
            //Step 1. of the UI display! The user needs to see what he can choose from!
            printConversionChoice();
            //Step 2. the user makes a choice and then with the help of the scanner, so we can lead him to the next step - entering the amount of money he wants to exchange
            int choice = scanner.nextInt();
// Step  3: User has to be able to make a choice: we need to get the conversionRate as the user's choice. This should be a double!
            double conversionRate = getConversionRate(choice);


        }
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
}







