package com.bress.portfolio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bress.portfolio.entities.Company;
import com.bress.portfolio.repositories.BaseRepository;
import com.bress.portfolio.repositories.CompanyRepository;

@Service
public class CompanyServiceImpl extends BaseServiceImpl<Company, Long> implements CompanyService {

	@Autowired
	private CompanyRepository companyRepository;
	
	public CompanyServiceImpl(BaseRepository<Company, Long> baseRepository) {
		super(baseRepository);
	}

}
