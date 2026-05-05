package com.hairhealth.backend.repository;

import com.hairhealth.backend.model.HairAnalysis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HairAnalysisRepository extends JpaRepository<HairAnalysis, Long> {
}