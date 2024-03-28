package exception;

public abstract class Payment implements Payable {
    private String shopName;
    private String productName;
    private long productPrice;

    public Payment(){}
    public Payment(String shopName, String productName, long productPrice) {
        this.shopName = shopName;
        this.productName = productName;
        this.productPrice = productPrice;
    }
    
    public String getShopName() {
        return this.shopName;
    }
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
    public String getProductName() {
        return this.productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public long getProductPrice() {
        return this.productPrice;
    }
    public void setProductPrice(long productPrice) {
        this.productPrice = productPrice;
    }
    @Override
    public String toString() {
        return "{" +
            " shopName='" + getShopName() + "'" +
            ", productName='" + getProductName() + "'" +
            ", productPrice='" + getProductPrice() + "'" +
            "}";
    }
    @Override
    public void pay() throws PayException {

    }
    public abstract void Payment();
}
