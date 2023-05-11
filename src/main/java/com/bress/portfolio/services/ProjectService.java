package com.bress.portfolio.services;

import java.util.List;

import com.bress.portfolio.entities.Project;

public interface ProjectService extends BaseService<Project, Long> {
	
	List<Project>  search(Long filtro) throws Exception;

}
