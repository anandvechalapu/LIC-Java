package com.Sacral.ai.service;

import com.Sacral.ai.model.QuotationMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface QuotationMemberService extends JpaRepository<QuotationMember, Long> {

    // remove an existing quotation member
    @Transactional
    @Modifying
    @Query("DELETE FROM QuotationMember q WHERE q.quotationId = :quotationId AND q.batchId = :batchId")
    void removeQuotationMember(@Param("quotationId") Long quotationId, @Param("batchId") Long batchId);
    
    // find a quotation member by its id
    QuotationMember findById(Long id);

    // calculate contributions and save the updated quotation
    @Transactional
    @Modifying
    @Query("UPDATE Quotation q SET q.contributions = :contributions WHERE q.quotationId = :quotationId AND q.type = 'DC'")
    void saveQuotation(@Param("contributions") Double contributions, @Param("quotationId") Long quotationId);

}