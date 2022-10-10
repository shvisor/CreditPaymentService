public class CreditPaymentService {
    public double calculate(int loan, int period, double rate) { /* если бы period был в годах, то для расчета нужно его умножить на 12 */
        double percent = rate / 100; /* перевод процентов в числовой формат */
        double monthlyRate = percent / 12; /* расчет месячной ставки */
        double ratio = (monthlyRate * Math.pow(1 + monthlyRate, period)) / (Math.pow(1 + monthlyRate, period) - 1); /* расчет коэффициента */
        double payment = loan * ratio; /* расчет ежемесячного платежа */
        double result = Math.round(payment * 100d) / 100d; /* округление до сотых долей (до копеек) */
        return result;
    }
}