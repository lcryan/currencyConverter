import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1. Give user currencies to chose from (here String output): //

        System.out.println("1 Euro");
        System.out.println("2 Dollar");
        System.out.println("3 Yen");
        System.out.println("4 Yuan");

        //2.  Declare a NEW scanner //

        Scanner inputUser = new Scanner(System.in); // system takes values given in via scanner from here //

        //3. Take in the user input via the scanner//

        System.out.println("Please choose your currency");
        int choice = inputUser.nextInt(); //User fills in a currency at this point //
        System.out.println("Enter the amount please: ");
        double userAmount = inputUser.nextDouble(); // takes in the amount of the currency chosen.
// switch case to convert the amount here :
        switch (choice) {
            case 1:
                Euro_to_Other(userAmount);
                break;
            case 2:
                Dollar_to_Other(userAmount);
                break;
            case 3:
                Yen_to_Other(userAmount);
            case 4:
                Yuan_to_Other(userAmount);
                break;
            default:
                System.out.println("Please enter a valid currency");
        }

    }
}

