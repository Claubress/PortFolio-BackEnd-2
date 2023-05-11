package com.bress.portfolio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bress.portfolio.entities.Education;
import com.bress.portfolio.repositories.BaseRepository;
import com.bress.portfolio.repositories.EducationRepository;

@Service
public class EducationServiceImpl extends BaseServiceImpl<Education, Long> implements EducationService{

	@Autowired
	private EducationRepository educationRepository;
	
	public EducationServiceImpl(BaseRepository<Education, Long> baseRepository) {
		super(baseRepository);
	}

	@Override
	public List<Education> search(Long filtro) throws Exception {
		try {
			List<Education> educations = educationRepository.search(filtro);
			return educations;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

}
