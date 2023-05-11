package com.bress.portfolio.services;

import java.util.List;

import com.bress.portfolio.entities.State;

public interface StateService extends BaseService<State, Long> {
	
	List<State>  search(Long filtro) throws Exception;

}
