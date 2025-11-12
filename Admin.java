// backend/src/main/java/com/example/hospital/model/Admin.java
package com.example.hospital.model;

public class Admin {
    private String id;
    private String username;
    private String fullName;

    public Admin() {}
    public Admin(String id, String username, String fullName) {
        this.id = id; this.username = username; this.fullName = fullName;
    }
    public String getId() { return id; }
    public String getUsername() { return username; }
    public String getFullName() { return fullName; }
    public void setId(String id) { this.id = id; }
    public void setUsername(String username) { this.username = username; }
    public void setFullName(String fullName) { this.fullName = fullName; }
}
