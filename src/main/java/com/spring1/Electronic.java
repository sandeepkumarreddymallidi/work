package com.spring1;

import java.util.Set;

public class Electronic {
    private int product_id;
    private String product_name;

    public Electronic(int product_id, String product_name, Set brands) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.brands = brands;
    }

    public Electronic() {
    }

    private Set brands;

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Set getBrands() {
        return brands;
    }

    public void setBrands(Set brands) {
        this.brands = brands;
    }
}
