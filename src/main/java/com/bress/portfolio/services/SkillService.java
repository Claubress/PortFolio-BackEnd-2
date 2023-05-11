package com.bress.portfolio.services;

import java.util.List;

import com.bress.portfolio.entities.Skill;

public interface SkillService extends BaseService<Skill, Long> {
	
	List<Skill>  search(Long filtro) throws Exception;

}
