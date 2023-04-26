package com.Sacral.ai.repository;

import com.Sacral.ai.model.QuotationMemberNomineeApiResponseDto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public class QuotationMemberNomineeRepository {
    private static final Logger LOGGER = LoggerFactory.getLogger(QuotationMemberNomineeRepository.class);

    @Autowired
    private QuotationMemberNomineeServiceImpl quotationMemberNomineeServiceImpl;

    @Transactional
    public QuotationMemberNomineeApiResponseDto deleteQuotationMemberNominee(Long nomineeId) {
        LOGGER.info("Starting to delete a Quotation Member Nominee with id {}", nomineeId);

        QuotationMemberNomineeApiResponseDto responseDto = null;
        try {
            responseDto = quotationMemberNomineeServiceImpl.deleteQuotationMemberNominee(nomineeId);
            LOGGER.info("Quotation Member Nominee with id {} deleted successfully", nomineeId);
        } catch (Exception e) {
            LOGGER.error("Error while deleting Quotation Member Nominee with id {}", nomineeId, e);
            responseDto = new QuotationMemberNomineeApiResponseDto("error", "fail");
        }

        return responseDto;
    }
}