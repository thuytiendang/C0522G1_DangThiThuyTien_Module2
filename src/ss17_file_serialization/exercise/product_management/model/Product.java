package ss17_file_serialization.exercise.product_management.model;

import java.io.Serializable;

public class Product implements Serializable {
    private String productCode;
    private String productName;
    private String manufacture;
    private double price;

    public Product(String productCode, String productName, String manufacture, double price) {
        this.productCode = productCode;
        this.productName = productName;
        this.manufacture = manufacture;
        this.price = price;
    }

    public Product() {
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product: " +
                "productCode: " + productCode +
                ", productName: " + productName +
                ", manufacture: " + manufacture +
                ", price: " + price;
    }
}
