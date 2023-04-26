package com.Sacral.ai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sacral.ai.model.Quotation;
import com.Sacral.ai.repository.QuotationTempRepository;

@Service
public class QuotationTempService {

	@Autowired
	private QuotationTempRepository quotationTempRepository;
	
	public List<Quotation> findAll() {
		return quotationTempRepository.findAll();
	}
	
	public Quotation findById(int id) {
		return quotationTempRepository.findById(id);
	}
	
	public Quotation save(Quotation quotation) {
		return quotationTempRepository.save(quotation);
	}
	
	public void deleteById(int id) {
		quotationTempRepository.deleteById(id);
	}
	
}