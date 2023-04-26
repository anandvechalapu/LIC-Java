package com.Sacral.ai.controller;

import com.Sacral.ai.model.QuotationMember;
import com.Sacral.ai.service.QuotationMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/quotation-member")
public class QuotationMemberController {

    @Autowired
    private QuotationMemberService quotationMemberService;

    @PostMapping
    public QuotationMember createQuotationMember(@RequestBody QuotationMember quotationMember){
        return quotationMemberService.save(quotationMember);
    }

    @DeleteMapping
    public void deleteQuotationMember(@RequestParam Long quotationId, @RequestParam Long batchId){
        quotationMemberService.removeQuotationMember(quotationId, batchId);
    }

    @GetMapping
    public QuotationMember findQuotationMember(@RequestParam Long id){
        return quotationMemberService.findById(id);
    }

    @PutMapping
    public void updateQuotationMember(@RequestParam Long quotationId, @RequestParam Long batchId, @RequestParam Double contributions){
        quotationMemberService.saveQuotation(contributions, quotationId);
    }
}