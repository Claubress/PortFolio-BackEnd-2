package com.bress.portfolio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bress.portfolio.entities.City;
import com.bress.portfolio.entities.State;
import com.bress.portfolio.repositories.BaseRepository;
import com.bress.portfolio.repositories.StateRepository;

@Service
public class StateServiceImpl extends BaseServiceImpl<State, Long> implements StateService {

    @Autowired
	private StateRepository stateRepository;
    
	public StateServiceImpl(BaseRepository<State, Long> baseRepository) {
		super(baseRepository);
	}

	@Override
	public List<State> search(Long filtro) throws Exception {
		try {
			List<State> states = stateRepository.search(filtro);
			return states;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}	}
	
	

}
