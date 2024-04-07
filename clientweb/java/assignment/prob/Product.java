public class Product {
    public static int setNumOfProduct;
    private int productCode;
    private int productCost;
    private int numOfProduct;

    public Product(){}
    public Product(int productCode, int productCost, int numOfProduct) {
        this.productCode = productCode;
        this.productCost = productCost;
        this.numOfProduct = numOfProduct;
    }
    public int getProductCode() {
        return this.productCode;
    }
    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }
    public int getProductCost() {
        return this.productCost;
    }
    public void setProductCost(int productCost) {
        this.productCost = productCost;
    }
    public int getNumOfProduct() {
        return this.numOfProduct;
    }
    public void setNumOfProduct(int numOfProduct) {
        this.numOfProduct = numOfProduct;
    }
    @Override
    public String toString() {
        return "{" +
            " productCode='" + getProductCode() + "'" +
            ", productCost='" + getProductCost() + "'" +
            ", numOfProduct='" + getNumOfProduct() + "'" +
            "}";
    }





}
