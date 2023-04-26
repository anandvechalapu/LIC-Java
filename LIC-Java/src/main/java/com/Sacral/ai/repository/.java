package com.Sacral.ai.repository;

import com.Sacral.ai.models.QuotationMemberNominee;
import com.Sacral.ai.models.QuotationMemberNomineeApiResponseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public class QuotationMemberNomineeRepository {

    @Autowired
    private EntityManager em;

    private static final Logger logger = LoggerFactory.getLogger(QuotationMemberNomineeRepository.class);

    @Transactional
    public QuotationMemberNomineeApiResponseDto deleteQuotationMemberNominee(Long nomineeId) {
        QuotationMemberNomineeApiResponseDto responseDto = new QuotationMemberNomineeApiResponseDto();
        try {
            logger.info("Started deleting nominee with id: {}", nomineeId);
            QuotationMemberNominee nominee = em.find(QuotationMemberNominee.class, nomineeId);
            if (nominee != null) {
                em.remove(nominee);
                responseDto.setTransactionStatus("success");
                responseDto.setTransactionMessage("deleted");
            } else {
                responseDto.setTransactionStatus("error");
                responseDto.setTransactionMessage("fail");
            }
            logger.info("Finished deleting nominee with id: {}", nomineeId);
        } catch (Exception e) {
            logger.error("Error deleting nominee with id: {}", nomineeId, e);
            responseDto.setTransactionStatus("error");
            responseDto.setTransactionMessage("fail");
        }
        return responseDto;
    }
}