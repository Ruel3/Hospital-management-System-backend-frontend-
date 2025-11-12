// backend/src/main/java/com/example/hospital/controller/ReceptionController.java
package com.example.hospital.controller;

import com.example.hospital.dto.ApiResponse;
import com.example.hospital.model.Reception;
import com.example.hospital.repo.InMemoryStore;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/reception")
@CrossOrigin
public class ReceptionController {
    private final InMemoryStore store;
    public ReceptionController(InMemoryStore store) { this.store = store; }

    @GetMapping
    public ApiResponse<Collection<Reception>> list() {
        return ApiResponse.success(store.receptions.values());
    }

    @PostMapping
    public ApiResponse<Reception> create(@RequestBody Reception r) {
        String id = store.newId();
        r.setId(id);
        store.receptions.put(id, r);
        return ApiResponse.success(r);
    }
}
