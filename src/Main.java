public class Main {
    public static void main(String[] args) {

        double euro = 5.8;
        double dollar = 13.5;
        double yuan = 350;

        double currencyRateEuroToDollar = euro * 1.10;
        double currencyDollarRateToEuro = dollar * 0.91;
        double currencyYuanToEuro = yuan * 0.13;
        System.out.println(euro + " euros " + "are currently " + currencyRateEuroToDollar + " dollar!");
        System.out.println(dollar + " dollar " + "are currently " + currencyDollarRateToEuro + " euro!");
        System.out.println(yuan + " yuan " + "are currently " + currencyYuanToEuro + " euro!");
    }
}