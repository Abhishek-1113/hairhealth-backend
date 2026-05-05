package com.hairhealth.backend.service;

import com.hairhealth.backend.model.HairAnalysis;
import com.hairhealth.backend.repository.HairAnalysisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HairAnalysisService {

    @Autowired
    private HairAnalysisRepository repository;

    public HairAnalysis save(HairAnalysis hairAnalysis) {
        return repository.save(hairAnalysis);
    }

    public List<HairAnalysis> getAll() {
        return repository.findAll();
    }
}