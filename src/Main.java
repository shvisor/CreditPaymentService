public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int loanAmount = 1_000_000;
        int loanPeriod = 1;
        double interestRate = 9.99; /* Годовая процентная ставка по кредиту */
        double loanPayment = service.calculate(loanAmount, loanPeriod, interestRate);
        System.out.println("Ежемесячный платеж: " + loanPayment + " ₽");

        System.out.println("Ежемесячный платеж: " + service.calculate(1000000, 2, 9.99) + " ₽");

        System.out.println("Ежемесячный платеж: " + service.calculate(1000000, 3, 9.99) + " ₽");

    }
}