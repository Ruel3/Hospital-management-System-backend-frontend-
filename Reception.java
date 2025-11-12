// backend/src/main/java/com/example/hospital/model/Reception.java
package com.example.hospital.model;

public class Reception {
    private String id;
    private String patientName;
    private String doctorId;
    private String appointmentTime; // simple string for demo

    public Reception() {}
    public Reception(String id, String patientName, String doctorId, String appointmentTime) {
        this.id = id; this.patientName = patientName; this.doctorId = doctorId; this.appointmentTime = appointmentTime;
    }
    public String getId() { return id; }
    public String getPatientName() { return patientName; }
    public String getDoctorId() { return doctorId; }
    public String getAppointmentTime() { return appointmentTime; }
    public void setId(String id) { this.id = id; }
    public void setPatientName(String patientName) { this.patientName = patientName; }
    public void setDoctorId(String doctorId) { this.doctorId = doctorId; }
    public void setAppointmentTime(String appointmentTime) { this.appointmentTime = appointmentTime; }
}
