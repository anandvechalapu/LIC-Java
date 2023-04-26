package com.Sacral.ai.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegularAdjustmentContributionRepository extends CrudRepository<RegularAdjustmentContribution, Long>{
   
    /**
     * Removes an adjustment contribution batch with the given batchId.
     *
     * @param batchId the batchId of the adjustment contribution batch to be removed
     * @return a JSON response with the following fields:
     *          transactionStatus: A string indicating the status of the transaction. It should be set to SUCCESS or FAILURE.
     *          transactionMessage: A string indicating the message for the transaction.
     */
    ResponseEntity<Map<String, String>> removeAdjustmentContributionBatch(Long batchId);
    
}