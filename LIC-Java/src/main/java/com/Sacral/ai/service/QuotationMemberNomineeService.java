package com.Sacral.ai.service;

import com.Sacral.ai.models.QuotationMemberNominee;
import com.Sacral.ai.models.QuotationMemberNomineeApiResponseDto;
import com.Sacral.ai.repository.QuotationMemberNomineeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuotationMemberNomineeService {

    @Autowired
    private QuotationMemberNomineeRepository quotationMemberNomineeRepository;

    private static final Logger logger = LoggerFactory.getLogger(QuotationMemberNomineeService.class);

    public QuotationMemberNomineeApiResponseDto deleteQuotationMemberNominee(Long nomineeId) {
        QuotationMemberNomineeApiResponseDto responseDto;
        try {
            logger.info("Started deleting nominee with id: {}", nomineeId);
            responseDto = quotationMemberNomineeRepository.deleteQuotationMemberNominee(nomineeId);
            logger.info("Finished deleting nominee with id: {}", nomineeId);
        } catch (Exception e) {
            logger.error("Error deleting nominee with id: {}", nomineeId, e);
            responseDto = new QuotationMemberNomineeApiResponseDto();
            responseDto.setTransactionStatus("error");
            responseDto.setTransactionMessage("fail");
        }
        return responseDto;
    }

}