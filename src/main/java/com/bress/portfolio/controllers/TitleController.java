package com.bress.portfolio.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bress.portfolio.entities.Title;
import com.bress.portfolio.services.TitleServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/titles")
public class TitleController extends BaseControllerImpl<Title, TitleServiceImpl>{

}
