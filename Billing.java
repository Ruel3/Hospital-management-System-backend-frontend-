// backend/src/main/java/com/example/hospital/model/Billing.java
package com.example.hospital.model;

public class Billing {
    private String id;
    private String patientName;
    private String service;
    private double amount;
    private boolean paid;

    public Billing() {}
    public Billing(String id, String patientName, String service, double amount, boolean paid) {
        this.id = id; this.patientName = patientName; this.service = service; this.amount = amount; this.paid = paid;
    }
    public String getId() { return id; }
    public String getPatientName() { return patientName; }
    public String getService() { return service; }
    public double getAmount() { return amount; }
    public boolean isPaid() { return paid; }
    public void setId(String id) { this.id = id; }
    public void setPatientName(String patientName) { this.patientName = patientName; }
    public void setService(String service) { this.service = service; }
    public void setAmount(double amount) { this.amount = amount; }
    public void setPaid(boolean paid) { this.paid = paid; }
}
