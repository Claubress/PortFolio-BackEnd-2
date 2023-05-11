package com.bress.portfolio.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bress.portfolio.entities.Skill;

public interface SkillRepository extends BaseRepository<Skill, Long> {

	@Query(value = "SELECT * FROM skill WHERE skill.person_id = :filtro ORDER BY skill.id",
		   nativeQuery = true)
	
	List<Skill>  search(@Param("filtro") Long filtro);
	
}
