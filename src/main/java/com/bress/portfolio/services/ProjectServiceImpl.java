package com.bress.portfolio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bress.portfolio.entities.Project;
import com.bress.portfolio.repositories.BaseRepository;
import com.bress.portfolio.repositories.ProjectRepository;

@Service
public class ProjectServiceImpl extends BaseServiceImpl<Project, Long> implements ProjectService{

	@Autowired
	private ProjectRepository projectRepository;
	
	public ProjectServiceImpl(BaseRepository<Project, Long> baseRepository) {
		super(baseRepository);
	}

	@Override
	public List<Project> search(Long filtro) throws Exception {
		try {
			List<Project> projects = projectRepository.search(filtro);
			return projects;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}	}
 
}
