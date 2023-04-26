package com.Sacral.ai.model;

import javax.persistence.*;

@Entity
@Table(name="quotation_member_bank_detail_temp")
public class QuotationMemberBankDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="bank_id")
    private Long bankId;

    public Long getBankId() {
        return bankId;
    }

    public void setBankId(Long bankId) {
        this.bankId = bankId;
    }
}