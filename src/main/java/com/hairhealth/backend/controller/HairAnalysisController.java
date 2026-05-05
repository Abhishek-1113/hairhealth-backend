package com.hairhealth.backend.controller;

import com.hairhealth.backend.model.HairAnalysis;
import com.hairhealth.backend.service.HairAnalysisService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.hairhealth.backend.dto.HairAnalysisDTO;

import java.util.List;

@RestController
@RequestMapping("/api/hair")
public class HairAnalysisController {

    @Autowired
    private HairAnalysisService service;

    // 🔹 Create / Save data
    @PostMapping
    public HairAnalysis save(@Valid @RequestBody HairAnalysisDTO dto) {
        return service.save(dto);
    }

    // 🔹 Get all records
    @GetMapping
    public List<HairAnalysis> getAll() {
        return service.getAll();
    }
}