package com.Sacral.ai.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="quotation_member_nominee")
public class QuotationMemberNominee implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nomineeId;

    private String name;

    private String relationship;

    private String gender;

    private String dateOfBirth;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "member_id")
    private QuotationMember quotationMember;

    public QuotationMemberNominee() {
    }

    public Long getNomineeId() {
        return nomineeId;
    }

    public void setNomineeId(Long nomineeId) {
        this.nomineeId = nomineeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public QuotationMember getQuotationMember() {
        return quotationMember;
    }

    public void setQuotationMember(QuotationMember quotationMember) {
        this.quotationMember = quotationMember;
    }

}