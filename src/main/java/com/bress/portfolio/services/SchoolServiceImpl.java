package com.bress.portfolio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bress.portfolio.entities.School;
import com.bress.portfolio.repositories.BaseRepository;
import com.bress.portfolio.repositories.SchoolRepository;

@Service
public class SchoolServiceImpl extends BaseServiceImpl<School, Long> implements SchoolService{

	@Autowired
	private SchoolRepository schoolRepository; 
	
	public SchoolServiceImpl(BaseRepository<School, Long> baseRepository) {
		super(baseRepository);
	}

}
