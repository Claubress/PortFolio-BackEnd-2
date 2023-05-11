package com.bress.portfolio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bress.portfolio.entities.Position;
import com.bress.portfolio.repositories.BaseRepository;
import com.bress.portfolio.repositories.PositionRepository;

@Service
public class PositionServiceImpl extends BaseServiceImpl<Position, Long> implements PositionService {

	@Autowired
	private PositionRepository positionRepository;
	
	public PositionServiceImpl(BaseRepository<Position, Long> baseRepository) {
		super(baseRepository);
	}

}
