// backend/src/main/java/com/example/hospital/model/PharmacyItem.java
package com.example.hospital.model;

public class PharmacyItem {
    private String id;
    private String name;
    private int quantity;

    public PharmacyItem() {}
    public PharmacyItem(String id, String name, int quantity) {
        this.id = id; this.name = name; this.quantity = quantity;
    }
    public String getId() { return id; }
    public String getName() { return name; }
    public int getQuantity() { return quantity; }
    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}
