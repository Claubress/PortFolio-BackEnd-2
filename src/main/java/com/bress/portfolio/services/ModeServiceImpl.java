package com.bress.portfolio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bress.portfolio.entities.Mode;
import com.bress.portfolio.repositories.BaseRepository;
import com.bress.portfolio.repositories.ModeRepository;

@Service
public class ModeServiceImpl extends BaseServiceImpl<Mode, Long> implements ModeService {
	
	@Autowired
	private ModeRepository modeRepository;
	
	public ModeServiceImpl(BaseRepository<Mode, Long> baseRepository) {
		super(baseRepository);
	}

	

}
