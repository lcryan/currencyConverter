public class Main {
    public static void main(String[] args) {

        double euro = 5.8;
        double dollar = 13.5;

        double currencyRateEuroToDollar = euro * 1.10;
        double currencyDollarRateToEuro = dollar * 0.91;
        System.out.println(euro + " euros " + "are currently " + currencyRateEuroToDollar + " dollars!");
        System.out.println(dollar + " dollar " + "are currently " + currencyDollarRateToEuro + " euros!");
    }
}