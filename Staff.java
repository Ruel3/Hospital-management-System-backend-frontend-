// backend/src/main/java/com/example/hospital/model/Staff.java
package com.example.hospital.model;

public class Staff {
    public enum Role { DOCTOR, NURSE }
    private String id;
    private String name;
    private Role role;
    private String department;

    public Staff() {}
    public Staff(String id, String name, Role role, String department) {
        this.id = id; this.name = name; this.role = role; this.department = department;
    }
    public String getId() { return id; }
    public String getName() { return name; }
    public Role getRole() { return role; }
    public String getDepartment() { return department; }
    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setRole(Role role) { this.role = role; }
    public void setDepartment(String department) { this.department = department; }
}
