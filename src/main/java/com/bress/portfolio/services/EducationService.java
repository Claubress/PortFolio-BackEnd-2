package com.bress.portfolio.services;

import java.util.List;

import com.bress.portfolio.entities.Education;

public interface EducationService extends BaseService<Education, Long> {
	
	List<Education>  search(Long filtro) throws Exception;

}
