package com.bress.portfolio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bress.portfolio.entities.Experience;
import com.bress.portfolio.repositories.BaseRepository;
import com.bress.portfolio.repositories.ExperienceRepository;

@Service
public class ExperienceServiceImpl extends BaseServiceImpl<Experience, Long>  implements ExperienceService{

	@Autowired
	private ExperienceRepository experienceRepository;
	
	public ExperienceServiceImpl(BaseRepository<Experience, Long> baseRepository) {
		super(baseRepository);
	}

	@Override
	public List<Experience> search(Long filtro) throws Exception {
		try {
			List<Experience> experiences = experienceRepository.search(filtro);
			return experiences;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	
	

}
