package exception;
import java.util.Objects;

public class CardPayment extends Payment {
    private String cardNumber;
    private String cardPassword;
    private int monthlyInstallment;

    public CardPayment(){}
    public CardPayment(String shopName, String productName, long productPrice, String cardNumber, String cardPassword, int monthlyInstallment) {
        super(shopName,productName,productPrice);
        this.cardNumber = cardNumber;
        this.cardPassword = cardPassword;
        this.monthlyInstallment = monthlyInstallment;
    }
    public String getCardNumber() {
        return this.cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    public String getCardPassword() {
        return this.cardPassword;
    }
    public void setCardPassword(String cardPassword) {
        this.cardPassword = cardPassword;
    }
    public int getMonthlyInstallment() {
        return this.monthlyInstallment;
    }
    public void setMonthlyInstallment(int monthlyInstallment) {
        this.monthlyInstallment = monthlyInstallment;
    }
    @Override
    public String toString() {
        return "{" +
            " cardNumber='" + getCardNumber() + "'" +
            ", cardPassword='" + getCardPassword() + "'" +
            ", monthlyInstallment='" + getMonthlyInstallment() + "'" +
            "}";
    }
    @Override
    public void Payment() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Payment'");
    }



}
