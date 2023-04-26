package com.Sacral.ai.controller;

import com.Sacral.ai.models.QuotationMemberNominee;
import com.Sacral.ai.models.QuotationMemberNomineeApiResponseDto;
import com.Sacral.ai.service.QuotationMemberNomineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/quote/nominee")
public class QuotationMemberNomineeController {

    @Autowired
    private QuotationMemberNomineeService quotationMemberNomineeService;

    @DeleteMapping("/delete/{nomineeId}")
    public QuotationMemberNomineeApiResponseDto deleteQuotationMemberNominee(@PathVariable("nomineeId") Long nomineeId) {
        return quotationMemberNomineeService.deleteQuotationMemberNominee(nomineeId);
    }

}