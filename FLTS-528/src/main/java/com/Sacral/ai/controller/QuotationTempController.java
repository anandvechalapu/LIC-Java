package com.Sacral.ai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Sacral.ai.model.Quotation;
import com.Sacral.ai.service.QuotationTempService;

@RestController
@RequestMapping("/quotations")
public class QuotationTempController {
	
	@Autowired
	private QuotationTempService quotationTempService;
	
	@GetMapping
	public List<Quotation> findAll() {
		return quotationTempService.findAll();
	}
	
	@GetMapping("/{id}")
	public Quotation findById(@PathVariable int id) {
		return quotationTempService.findById(id);
	}
	
	@PostMapping
	public Quotation save(@RequestBody Quotation quotation) {
		return quotationTempService.save(quotation);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable int id) {
		quotationTempService.deleteById(id);
	}
	
}