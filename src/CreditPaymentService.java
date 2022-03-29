public class CreditPaymentService {
    public double calculate(double year) {
        double sum = 1_000_000;
        double month = year * 12;
        double percentRate = 9.99 / (100 * 12);
        double x = 1 + percentRate;
        double pow = Math.pow(x, month);
        return sum * ((percentRate * pow) / (pow - 1));
    }
}
