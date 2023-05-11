package com.bress.portfolio.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bress.portfolio.entities.Project;

public interface ProjectRepository extends BaseRepository<Project, Long> {
	
	@Query(value = "SELECT * FROM project WHERE project.person_id = :filtro ORDER BY project.id",
		   nativeQuery = true)
	
	List<Project>  search(@Param("filtro") Long filtro);


}
