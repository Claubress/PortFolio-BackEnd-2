package com.bress.portfolio.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bress.portfolio.entities.Country;
import com.bress.portfolio.services.CountryServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/countries")
public class CountryController extends BaseControllerImpl<Country, CountryServiceImpl> {

}
