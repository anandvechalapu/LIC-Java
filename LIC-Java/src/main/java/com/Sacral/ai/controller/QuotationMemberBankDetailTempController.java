package com.Sacral.ai.controller;

import com.Sacral.ai.model.QuotationMemberBankDetail;
import com.Sacral.ai.service.QuotationMemberBankDetailTempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/quotationmemberbankdetailtemp")
public class QuotationMemberBankDetailTempController {

    @Autowired
    private QuotationMemberBankDetailTempService quotationMemberBankDetailTempService;

    @GetMapping("/{bankId}")
    public Optional<QuotationMemberBankDetail> getById(@PathVariable Long bankId) {
        return quotationMemberBankDetailTempService.getById(bankId);
    }

    @DeleteMapping("/{bankId}")
    public void deleteById(@PathVariable Long bankId) {
        quotationMemberBankDetailTempService.deleteById(bankId);
    }
}