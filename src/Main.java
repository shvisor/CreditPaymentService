public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int loanAmount = 1_000_000; /* сумма кредита */
        int loanPeriod = 12; /* срок кредита в месяцах. если бы срок был в годах, то для расчета локальной переменной ratio параметр period нужно умножить на 12 или ввести локальную переменную с расчетом периода в месяцах */
        double interestRate = 9.99; /* годовая процентная ставка по кредиту */
        double loanPayment = service.calculate(loanAmount, loanPeriod, interestRate);
        System.out.println("Ежемесячны платеж: " + loanPayment + " ₽");

        System.out.println("Ежемесячны платеж: " + service.calculate(1000000, 24, 9.99) + " ₽");

        System.out.println("Ежемесячны платеж: " + service.calculate(1000000, 36, 9.99) + " ₽");

    }
}