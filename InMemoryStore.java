// backend/src/main/java/com/example/hospital/repo/InMemoryStore.java
package com.example.hospital.repo;

import com.example.hospital.model.*;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class InMemoryStore {
    public final Map<String, Admin> admins = new ConcurrentHashMap<>();
    public final Map<String, Staff> staff = new ConcurrentHashMap<>();
    public final Map<String, Doctor> doctors = new ConcurrentHashMap<>();
    public final Map<String, Nurse> nurses = new ConcurrentHashMap<>();
    public final Map<String, Reception> receptions = new ConcurrentHashMap<>();
    public final Map<String, PharmacyItem> pharmacy = new ConcurrentHashMap<>();
    public final Map<String, Billing> billings = new ConcurrentHashMap<>();

    private String id() { return UUID.randomUUID().toString(); }

    @PostConstruct
    public void seed() {
        String adminId = id();
        admins.put(adminId, new Admin(adminId, "admin", "System Admin"));

        String d1 = id();
        doctors.put(d1, new Doctor(d1, "Dr. Amina", "Cardiology"));

        String n1 = id();
        nurses.put(n1, new Nurse(n1, "Nurse Peter", "Ward 3"));

        String s1 = id();
        staff.put(s1, new Staff(s1, "Dr. Amina", Staff.Role.DOCTOR, "Cardiology"));
        String s2 = id();
        staff.put(s2, new Staff(s2, "Nurse Peter", Staff.Role.NURSE, "Ward 3"));

        String p1 = id();
        pharmacy.put(p1, new PharmacyItem(p1, "Amoxicillin 500mg", 120));

        String b1 = id();
        billings.put(b1, new Billing(b1, "John Doe", "Consultation", 1500.0, false));
    }

    public String newId() { return id(); }
}
