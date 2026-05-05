package com.hairhealth.backend.dto;

import jakarta.validation.constraints.NotBlank;

public class HairAnalysisDTO {

    @NotBlank(message = "Hair type is required")
    private String hairType;

    @NotBlank(message = "Issue is required")
    private String issue;

    private String recommendation;

    // Getters & Setters
    public String getHairType() {
        return hairType;
    }

    public void setHairType(String hairType) {
        this.hairType = hairType;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }
}