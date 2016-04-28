package de.programierenlernenhq.shoppinglisthq;

/**
 * Created by ataeschner on 28.04.2016.
 */
public class ShoppingMemo {

    private String product;
    private int quantity;
    private long id;

    public ShoppingMemo(String product, int quantity, long id) {
        this.id = id;
        this.quantity = quantity;
        this.product = product;
    }

    @Override
    public String toString() {
        return quantity + " x " + product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
