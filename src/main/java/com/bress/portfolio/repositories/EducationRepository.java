package com.bress.portfolio.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bress.portfolio.entities.Education;

public interface EducationRepository extends BaseRepository<Education, Long> {

	@Query(value = "SELECT * FROM education WHERE education.person_id = :filtro ORDER BY education.id",
		   nativeQuery = true)
	
	List<Education>  search(@Param("filtro") Long filtro);

}
