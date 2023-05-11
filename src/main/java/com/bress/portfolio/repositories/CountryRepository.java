package com.bress.portfolio.repositories;

import org.springframework.stereotype.Repository;

import com.bress.portfolio.entities.Country;

@Repository
public interface CountryRepository extends BaseRepository<Country, Long> {

}
