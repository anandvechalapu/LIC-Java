package com.Sacral.ai.service;

import com.Sacral.ai.model.QuotationMemberBankDetail;
import com.Sacral.ai.repository.QuotationMemberBankDetailTempRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class QuotationMemberBankDetailTempService {

    @Autowired
    private QuotationMemberBankDetailTempRepository quotationMemberBankDetailTempRepository;

    public Optional<QuotationMemberBankDetail> getById(Long bankId) {
        return quotationMemberBankDetailTempRepository.findById(bankId);
    }

    public void deleteById(Long bankId) {
        quotationMemberBankDetailTempRepository.deleteById(bankId);
    }
}