package exception;

public class CashPayment extends Payment {
    private String cashReceiptNumber;

    public CashPayment(String shopName, String productName, long productPrice, String cashReceiptNumber) {
        super(shopName,productName,productPrice);
        this.cashReceiptNumber = cashReceiptNumber;
    }
    public String getCashReceiptNumber() {
        return this.cashReceiptNumber;
    }
    public void setCashReceiptNumber(String cashReceiptNumber) {
        this.cashReceiptNumber = cashReceiptNumber;
    }
    @Override
    public String toString() {
        return "{" +
            " cashReceiptNumber='" + getCashReceiptNumber() + "'" +
            "}";
    }
    @Override
    public void Payment() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Payment'");
    }
}
