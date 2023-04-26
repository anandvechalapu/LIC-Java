package com.Sacral.ai.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Sacral.ai.service.RegularAdjustmentContributionService;

@RestController
public class RegularAdjustmentContributionController {

    private final RegularAdjustmentContributionService regularAdjustmentContributionService;

    public RegularAdjustmentContributionController(RegularAdjustmentContributionService regularAdjustmentContributionService) {
        this.regularAdjustmentContributionService = regularAdjustmentContributionService;
    }

    /**
     * Removes an adjustment contribution batch with the given batchId.
     *
     * @param batchId the batchId of the adjustment contribution batch to be removed
     * @return a JSON response with the following fields:
     *          transactionStatus: A string indicating the status of the transaction. It should be set to SUCCESS or FAILURE.
     *          transactionMessage: A string indicating the message for the transaction.
     */
    @DeleteMapping("/regularAdjustmentContribution/remove/{batchId}")
    public ResponseEntity<Map<String, String>> removeAdjustmentContributionBatch(@PathVariable Long batchId) {
        return regularAdjustmentContributionService.removeAdjustmentContributionBatch(batchId);
    }
}