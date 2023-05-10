import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Declare scanner: //
        Scanner scanner = new Scanner(System.in);

        //2. define a boolean for the while statement has been used here.//
        boolean continueConversion = true;

        while (continueConversion) {
            //3. Inside the while loop first give a print-out of choices to the user.//
            System.out.println("Please choose your conversion preference here: ");
            System.out.println("Enter 1: Euro to Dollar");
            System.out.println("Enter 2: Dollar to Euro");
            System.out.println("Enter 3: Yen to Euro");
            System.out.println("Enter 4: Euro to Yen");
            System.out.println("Enter 5: Euro to Renminbi Yuan");
            System.out.println("Enter 6: Renminbi Yuan to Euro");

            //4. Make sure that the scanner reacts when a choice is made.
            int choice = scanner.nextInt();
            //5. conversionRate should be 0 for now; declare empty strings for the currency-names -
            // these have to be
            //filled in later.
            double conversionRate = 0;
            String currencyFrom = "";
            String currencyTo = "";
// 6. Now make a switch-statement inside the while statement. Here we make sure that our double
// conversionRate is actually filled with the right conversion rate of the given currency.
            switch (choice) {
                case 1 -> {
                    conversionRate = 0.91;
                    currencyFrom = "Euros";
                    currencyTo = "Dollars";
                }
                case 2 -> {
                    conversionRate = 1.19;
                    currencyFrom = "Dollars";
                    currencyTo = "Euros";
                }
                case 3 -> {
                    conversionRate = 0.0068;
                    currencyFrom = "Yen";
                    currencyTo = "Euros";
                }
                case 4 -> {
                    conversionRate = 147.96;
                    currencyFrom = "Euros";
                    currencyTo = "Yen";
                }
                case 5 -> {
                    conversionRate = 7.60;
                    currencyFrom = "Euros";
                    currencyTo = "Renminbi Yuan";
                }
                case 6 -> {
                    conversionRate = 0.13;
                    currencyFrom = "Renminbi Yuan";
                    currencyTo = "Euros";
                }
                default -> {
                    System.out.println("Invalid input. Please choose a number between 1 and 6.");
                    continue;
                }
            }

            //7. Now the user has to have the possibility to enter the amount of currency he chose.
            System.out.println("Please enter the amount of " + currencyFrom + ": ");

            double amountFrom = scanner.nextDouble();
// 8. Now we calculate the exchange rate by multiplying the amount with the given conversion rate.
            double amountTo = amountFrom * conversionRate;

            System.out.println("Your given amount of " + amountFrom + " " + currencyFrom + " is " + Math.round(amountTo * 100.0) / 100.0 + " " + currencyTo + ".");
//9. We give the user the possibility to calculate another rate.
// Once NO is given within the if statement, we exit the program. See here line 79 to 80.
            System.out.println("Do you want to make another conversion? Please enter Yes/No");
            String userAnswer = scanner.next();
            if (!userAnswer.equalsIgnoreCase("Yes")) {
                continueConversion = false;
            }
        }
        System.out.println("Thank you for using our awesome service.");
    }
}

