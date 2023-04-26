package com.Sacral.ai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Sacral.ai.model.Quotation;

@Repository
public interface QuotationTempRepository extends JpaRepository<Quotation, Integer> {
	
	Quotation findById(int id);
	
	Quotation save(Quotation quotation);

}