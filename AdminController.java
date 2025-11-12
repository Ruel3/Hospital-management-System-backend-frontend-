// backend/src/main/java/com/example/hospital/controller/AdminController.java
package com.example.hospital.controller;

import com.example.hospital.dto.ApiResponse;
import com.example.hospital.model.Admin;
import com.example.hospital.repo.InMemoryStore;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/admins")
@CrossOrigin
public class AdminController {
    private final InMemoryStore store;
    public AdminController(InMemoryStore store) { this.store = store; }

    @GetMapping
    public ApiResponse<Collection<Admin>> list() {
        return ApiResponse.success(store.admins.values());
    }

    @PostMapping
    public ApiResponse<Admin> create(@RequestBody Admin a) {
        String id = store.newId();
        a.setId(id);
        store.admins.put(id, a);
        return ApiResponse.success(a);
    }
}
