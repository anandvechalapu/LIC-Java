package com.Sacral.ai.service;

import com.Sacral.ai.model.QuotationMemberNomineeApiResponseDto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class QuotationMemberNomineeServiceImpl {
    private static final Logger LOGGER = LoggerFactory.getLogger(QuotationMemberNomineeServiceImpl.class);

    @Transactional
    public QuotationMemberNomineeApiResponseDto deleteQuotationMemberNominee(Long nomineeId) {
        LOGGER.info("Starting to delete a Quotation Member Nominee with id {}", nomineeId);

        // business logic to delete the Quotation Member Nominee

        QuotationMemberNomineeApiResponseDto responseDto = new QuotationMemberNomineeApiResponseDto("success", "pass");
        return responseDto;
    }
}