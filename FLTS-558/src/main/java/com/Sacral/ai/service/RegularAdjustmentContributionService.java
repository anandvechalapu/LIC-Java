package com.Sacral.ai.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Sacral.ai.repository.RegularAdjustmentContributionRepository;

@Service
public class RegularAdjustmentContributionService {

    @Autowired
    RegularAdjustmentContributionRepository regularAdjustmentContributionRepository;

    /**
     * Removes an adjustment contribution batch with the given batchId.
     *
     * @param batchId the batchId of the adjustment contribution batch to be removed
     * @return a JSON response with the following fields:
     *          transactionStatus: A string indicating the status of the transaction. It should be set to SUCCESS or FAILURE.
     *          transactionMessage: A string indicating the message for the transaction.
     */
    public ResponseEntity<Map<String, String>> removeAdjustmentContributionBatch(Long batchId) {
        try {
            regularAdjustmentContributionRepository.deleteById(batchId);
            return ResponseEntity.status(200).body(Map.of("transactionStatus", "SUCCESS", "transactionMessage", "Batch removed successfully"));
        } catch (Exception e) {
            return ResponseEntity.status(500).body(Map.of("transactionStatus", "FAILURE", "transactionMessage", e.getMessage()));
        }
    }
}