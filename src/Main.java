import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
// this should be the user's input within the scanner,
// the user is supposed to only get the user input and then the machine calculates
// the currency exchange- how to solve this with the scanner ?
        double euro = 5.8;
        double dollar = 13.5;
        double yuan = 350;


        double currencyRateEuroToDollar = euro * 1.10;
        double currencyDollarRateToEuro = dollar * 0.91;
        double currencyYuanToEuro = yuan * 0.13;

/*        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter currency");
        currencyDollarRateToEuro = Double.parseDouble(myObj.nextLine());

        System.out.println("Your currency exchange is: " + currencyDollarRateToEuro);*/

        System.out.println(euro + " euro " + "are currently " + currencyRateEuroToDollar + " dollar!");
        System.out.println(dollar + " dollar " + "are currently " + currencyDollarRateToEuro + " euro!");
        System.out.println(yuan + " yuan " + "are currently " + currencyYuanToEuro + " euro!");
    }
}





