package com.bress.portfolio.services;

import java.util.List;


import com.bress.portfolio.entities.City;

public interface CityService extends BaseService<City, Long> {
	
	List<City>  search(Long filtro) throws Exception;

}
