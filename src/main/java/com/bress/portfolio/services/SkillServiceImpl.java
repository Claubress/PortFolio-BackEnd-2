package com.bress.portfolio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bress.portfolio.entities.Skill;
import com.bress.portfolio.repositories.BaseRepository;
import com.bress.portfolio.repositories.SkillRepository;

@Service
public class SkillServiceImpl extends BaseServiceImpl<Skill, Long> implements SkillService{

	@Autowired
	private SkillRepository skillRepository;
	
	public SkillServiceImpl(BaseRepository<Skill, Long> baseRepository) {
		super(baseRepository);
	}

	@Override
	public List<Skill> search(Long filtro) throws Exception {
		try {
			List<Skill> skills = skillRepository.search(filtro);
			return skills;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}	}
 
}
