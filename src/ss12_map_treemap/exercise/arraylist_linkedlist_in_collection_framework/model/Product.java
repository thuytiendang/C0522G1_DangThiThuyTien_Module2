package ss12_map_treemap.exercise.arraylist_linkedlist_in_collection_framework.model;

public class Product {
    private int id;
    private String nameOfProduct;
    private float price;

    public Product(int id, String nameOfProduct, float price) {
        this.id = id;
        this.nameOfProduct = nameOfProduct;
        this.price = price;
    }

    public Product() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product: " +
                "id: " + id +
                ", nameOfProduct: " + nameOfProduct +
                ", price: " + price;
    }
}
