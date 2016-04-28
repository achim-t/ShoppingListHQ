package de.programierenlernenhq.shoppinglisthq;

import android.support.annotation.NonNull;

/**
 * Created by ataeschner on 28.04.2016.
 */
public class ShoppingMemo {

    private String product;
    private int quantity;
    private long id;
    private boolean checked;

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public ShoppingMemo(String product, int quantity, long id, boolean checked) {
        this.id = id;
        this.quantity = quantity;
        this.product = product;
        this.checked = checked;
    }

    @Override
    public String toString() {
        return quantity + " x " + product;
    }
    @NonNull
    public String getDebugString() {
        return "ID: " + id + " Inhalt: " + toString();
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
