package com.bress.portfolio.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bress.portfolio.entities.Experience;

public interface ExperienceRepository extends BaseRepository<Experience, Long> {
	
	@Query(value = "SELECT * FROM experience WHERE experience.person_id = :filtro ORDER BY experience.id",
		   nativeQuery = true)
	
	List<Experience>  search(@Param("filtro") Long filtro);

}
