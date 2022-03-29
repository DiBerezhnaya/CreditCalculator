public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double loanForOneYear = service.calculate(1);
        System.out.println("Ежемесячный платёж = " + Math.round(loanForOneYear) + " руб.");

        double loanForTwoYears = service.calculate(2);
        System.out.println("Ежемесячный платёж = " + Math.round(loanForTwoYears) + " руб.");

        double loanForThreeYears = service.calculate(3);
        System.out.println("Ежемесячный платёж = " + Math.round(loanForThreeYears) + " руб.");
    }
}
