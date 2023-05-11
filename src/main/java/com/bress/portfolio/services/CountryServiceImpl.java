package com.bress.portfolio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bress.portfolio.entities.Country;
import com.bress.portfolio.repositories.BaseRepository;
import com.bress.portfolio.repositories.CountryRepository;

@Service
public class CountryServiceImpl extends BaseServiceImpl<Country, Long> implements CountryService {

	@Autowired
	private CountryRepository countryRepository;
	
	public CountryServiceImpl(BaseRepository<Country, Long> baseRepository) {
		super(baseRepository);
	}

}
