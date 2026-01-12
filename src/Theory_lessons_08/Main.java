package Theory_lessons_08;

public class Main {
    public static void main(String[] args) {

        // Можно менять комиссию для всей системы
        CurrencyConverter.setCommissionRate(0.01); // 1%

        // Полиморфизм: тип Currency, но объект может быть USD или EUR
        Currency usd = new USD();
        Currency eur = new EUR();

        double amountUsd = 100;
        double amountEur = 50;

        double resultUsdToAzn = usd.convertToAZN(amountUsd);
        double resultEurToAzn = eur.convertToAZN(amountEur);

        System.out.println("Komissiya: " + (CurrencyConverter.getCommissionRate() * 100) + "%");
        System.out.println(amountUsd + " USD -> " + resultUsdToAzn + " AZN");
        System.out.println(amountEur + " EUR -> " + resultEurToAzn + " AZN");
    }
}
