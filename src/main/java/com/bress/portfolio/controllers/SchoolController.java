package com.bress.portfolio.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bress.portfolio.entities.School;
import com.bress.portfolio.services.SchoolServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/schools")
public class SchoolController extends BaseControllerImpl<School, SchoolServiceImpl>{

}
