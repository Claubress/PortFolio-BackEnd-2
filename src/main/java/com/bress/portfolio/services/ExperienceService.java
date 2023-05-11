package com.bress.portfolio.services;

import java.util.List;

import com.bress.portfolio.entities.Experience;

public interface ExperienceService extends BaseService<Experience, Long> {
	
	List<Experience>  search(Long filtro) throws Exception;

}
