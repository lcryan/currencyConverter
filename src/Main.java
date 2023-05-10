import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Please choose your exchange rate here: ");
        System.out.println("1 Euro to Dollar");
        System.out.println("2 Dollar to Euro");
        System.out.println("3 Yen to Euro");
        System.out.println("4 Euro to Yen");
        System.out.println("5 Yen to Euro");
        System.out.println("5 Euro to Renminbi Yuan");
        System.out.println("6 Renminbi Yuan to Euro");

        //1.  Declare a NEW scanner //

        Scanner inputUser = new Scanner(System.in); // system takes values given in via scanner from here //
// 2. declare boolean for while statement :

        boolean exchangeInput = true;

// 3. fill in all conversion rules for all currencies
        double conversionEuroToDollar = 0.91;
        double conversionDollarToEuro = 1.19;
        double conversionEuroToYen = 147.96;
        double conversionYenToEuro = 0.0068;
        double conversionEuroToYuan = 7.60;
        double conversionYuanToEuro = 0.13;

        //3. Take in the user input via the scanner//


        int choice = inputUser.nextInt(); //User fills in a currency at this point //
        // while and if else statement in combination


        while (exchangeInput) {

            if (choice == 1) {
                System.out.println("Please fill in your amount of Euros:");
                double euro = inputUser.nextDouble(); // input of amount euros here //
                double dollar = euro * conversionEuroToDollar;
                System.out.println("Your given amount of " + euro + " euros is " + (Math.round(dollar)) + " dollars.");
            } else if (choice == 2) {
                System.out.println("Please fill in your amount of Dollars:");
                double dollar = inputUser.nextDouble();
                double euro = dollar * conversionDollarToEuro;
                System.out.println("Your given amount of " + dollar + " dollar " + " is" + (Math.round(euro)) + " euro.");
                System.out.println("Please make another choice");
            } else if (choice == 3) {
                System.out.println("Please fill in the amount of Yen:");
                double yen = inputUser.nextDouble();
                double euro = yen * conversionYenToEuro;
                System.out.println("Your given amount of " + yen + " yen " + " is " + (Math.round(euro)) + " euro.");
            } else {
                System.out.println("Please choose one of the choices above.");
            }
            System.out.println("Do you want to choose another exchange rate? Yes/No");
            String userAnswer = inputUser.next();
            exchangeInput = userAnswer.equalsIgnoreCase("Yes");
        }
        System.out.println("Thank you for using our currency service.");
    }

}
