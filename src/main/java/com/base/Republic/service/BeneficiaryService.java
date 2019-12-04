package com.base.Republic.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.base.Republic.model.Beneficiary;
import com.base.Republic.repository.BeneficiaryRepository;

@Service
public class BeneficiaryService {
	
	@Autowired
	private BeneficiaryRepository beneficiaryRepo;
	
	
	@Transactional()
	public List<Beneficiary> loadAll() {
		List<Beneficiary> res = this.beneficiaryRepo.findAll();
		return res;
	}
}
