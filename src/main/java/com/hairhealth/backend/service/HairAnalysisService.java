package com.hairhealth.backend.service;

import com.hairhealth.backend.model.HairAnalysis;
import com.hairhealth.backend.repository.HairAnalysisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hairhealth.backend.dto.HairAnalysisDTO;


import java.util.List;

@Service
public class HairAnalysisService {

    @Autowired
    private HairAnalysisRepository repository;

    public HairAnalysis save(HairAnalysisDTO dto) {

        HairAnalysis entity = new HairAnalysis();
        entity.setHairType(dto.getHairType());
        entity.setIssue(dto.getIssue());
        entity.setRecommendation(dto.getRecommendation());

        return repository.save(entity);
    }

    public List<HairAnalysis> getAll() {
        return repository.findAll();
    }
}