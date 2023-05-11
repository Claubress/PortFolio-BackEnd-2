package com.bress.portfolio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bress.portfolio.entities.Title;
import com.bress.portfolio.repositories.BaseRepository;
import com.bress.portfolio.repositories.TitleRepository;

@Service
public class TitleServiceImpl extends BaseServiceImpl<Title, Long> implements TitleService {

    @Autowired   
	private TitleRepository titleRepository;
	
	public TitleServiceImpl(BaseRepository<Title, Long> baseRepository) {
		super(baseRepository);
	}

}
