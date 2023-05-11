package com.bress.portfolio.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.bress.portfolio.entities.Person;
import com.bress.portfolio.repositories.BaseRepository;
import com.bress.portfolio.repositories.PersonRepository;

@Service
public class PersonServiceImpl extends BaseServiceImpl<Person, Long> implements PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	public PersonServiceImpl(BaseRepository<Person, Long> baseRepository) {
		super(baseRepository);
	}
	
}