public class CreditPaymentService {
    /**
     * Расчет ежемесячного платежа по кредиту
     * @param loan сумма кредита
     * @param period срок кредита в месяцах
     * @param rate годовая процентная ставка по кредиту
     * @return возврат ежемесячного платежа с приведением к целочисленному типу
     */
    public double calculate(int loan, int period, double rate) {
        double percent = rate / 100 / 12; /* расчет месячной ставки */
        double payment = loan * ((percent * Math.pow((1 + percent), period * 12)) / (Math.pow((1 + percent), period * 12) - 1));
        return (int) payment;
    }
}