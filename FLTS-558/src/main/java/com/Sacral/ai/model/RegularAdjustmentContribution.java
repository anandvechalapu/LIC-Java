package com.Sacral.ai.model;

import java.util.Map;

import org.springframework.http.ResponseEntity;

public class RegularAdjustmentContribution {
    
    private Long batchId;
    private Map<Long, Long> adjustmentContributionMap;
    
    public RegularAdjustmentContribution() {
    }
    
    public RegularAdjustmentContribution(Long batchId, Map<Long, Long> adjustmentContributionMap) {
        this.batchId = batchId;
        this.adjustmentContributionMap = adjustmentContributionMap;
    }
    
    public Long getBatchId() {
        return batchId;
    }
    
    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }
    
    public Map<Long, Long> getAdjustmentContributionMap() {
        return adjustmentContributionMap;
    }
    
    public void setAdjustmentContributionMap(Map<Long, Long> adjustmentContributionMap) {
        this.adjustmentContributionMap = adjustmentContributionMap;
    }
}