package com.bress.portfolio.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bress.portfolio.entities.City;

@Repository
public interface CityRepository extends BaseRepository<City, Long> {
	
	@Query(value = "SELECT * FROM city WHERE city.state_id = :filtro ORDER BY city.name",
		   nativeQuery = true)
	
	List<City>  search(@Param("filtro") Long filtro);

}
