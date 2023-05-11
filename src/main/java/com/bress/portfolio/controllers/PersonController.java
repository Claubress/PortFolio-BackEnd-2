package com.bress.portfolio.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bress.portfolio.entities.Person;
import com.bress.portfolio.services.PersonServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/people")
public class PersonController extends BaseControllerImpl<Person, PersonServiceImpl> {
		
}