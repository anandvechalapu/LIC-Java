package com.Sacral.ai.controller;

import com.Sacral.ai.model.QuotationMemberNomineeApiResponseDto;
import com.Sacral.ai.service.QuotationMemberNomineeServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/quotationmembernominee")
public class QuotationMemberNomineeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(QuotationMemberNomineeController.class);

    @Autowired
    private QuotationMemberNomineeServiceImpl quotationMemberNomineeService;

    @DeleteMapping("/{id}")
    public ResponseEntity<QuotationMemberNomineeApiResponseDto> deleteQuotationMemberNominee(@PathVariable("id") Long nomineeId) {
        QuotationMemberNomineeApiResponseDto responseDto = quotationMemberNomineeService.deleteQuotationMemberNominee(nomineeId);
        LOGGER.info("Quotation Member Nominee deleted with id {}", nomineeId);
        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }

}