// backend/src/main/java/com/example/hospital/model/Nurse.java
package com.example.hospital.model;

public class Nurse {
    private String id;
    private String name;
    private String ward;

    public Nurse() {}
    public Nurse(String id, String name, String ward) {
        this.id = id; this.name = name; this.ward = ward;
    }
    public String getId() { return id; }
    public String getName() { return name; }
    public String getWard() { return ward; }
    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setWard(String ward) { this.ward = ward; }
}
