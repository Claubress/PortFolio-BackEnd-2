package com.bress.portfolio.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bress.portfolio.entities.State;

@Repository
public interface StateRepository extends BaseRepository<State, Long> {
	
	@Query(value = "SELECT * FROM state WHERE state.country_id = :filtro ORDER BY state.name",
		   nativeQuery = true)
	
	List<State>  search(@Param("filtro") Long filtro);

}
