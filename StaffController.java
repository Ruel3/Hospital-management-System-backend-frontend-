// backend/src/main/java/com/example/hospital/controller/StaffController.java
package com.example.hospital.controller;

import com.example.hospital.dto.ApiResponse;
import com.example.hospital.model.Staff;
import com.example.hospital.repo.InMemoryStore;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/staff")
@CrossOrigin
public class StaffController {
    private final InMemoryStore store;
    public StaffController(InMemoryStore store) { this.store = store; }

    @GetMapping
    public ApiResponse<Collection<Staff>> list() {
        return ApiResponse.success(store.staff.values());
    }

    @PostMapping
    public ApiResponse<Staff> create(@RequestBody Staff s) {
        String id = store.newId();
        s.setId(id);
        store.staff.put(id, s);
        return ApiResponse.success(s);
    }

    @DeleteMapping("/{id}")
    public ApiResponse<String> delete(@PathVariable String id) {
        store.staff.remove(id);
        return ApiResponse.success("deleted");
    }
}
