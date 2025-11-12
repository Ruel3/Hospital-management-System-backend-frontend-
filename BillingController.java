// backend/src/main/java/com/example/hospital/controller/BillingController.java
package com.example.hospital.controller;

import com.example.hospital.dto.ApiResponse;
import com.example.hospital.model.Billing;
import com.example.hospital.repo.InMemoryStore;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/billing")
@CrossOrigin
public class BillingController {
    private final InMemoryStore store;
    public BillingController(InMemoryStore store) { this.store = store; }

    @GetMapping
    public ApiResponse<Collection<Billing>> list() {
        return ApiResponse.success(store.billings.values());
    }

    @PostMapping
    public ApiResponse<Billing> create(@RequestBody Billing b) {
        String id = store.newId();
        b.setId(id);
        store.billings.put(id, b);
        return ApiResponse.success(b);
    }

    @PatchMapping("/{id}/pay")
    public ApiResponse<Billing> pay(@PathVariable String id) {
        Billing b = store.billings.get(id);
        if (b == null) return ApiResponse.error("not found");
        b.setPaid(true);
        return ApiResponse.success(b);
    }
}
