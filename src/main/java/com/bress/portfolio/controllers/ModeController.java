package com.bress.portfolio.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bress.portfolio.entities.Mode;
import com.bress.portfolio.services.ModeServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/modes")
public class ModeController extends BaseControllerImpl<Mode, ModeServiceImpl> {

}
