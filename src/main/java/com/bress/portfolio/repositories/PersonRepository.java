package com.bress.portfolio.repositories;


import org.springframework.stereotype.Repository;

import com.bress.portfolio.entities.Person;

@Repository
public interface PersonRepository extends BaseRepository<Person, Long> {

}
