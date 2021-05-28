package fr.formation.ponionz.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.ponionz.domain.dtos.LoanCreate;
import fr.formation.ponionz.services.LoanService;

@RestController
@RequestMapping("/loans")
public class LoanController {

    private final LoanService service;

    public LoanController(LoanService service) {
	this.service = service;
    }

    @PostMapping
    public void create(@Valid @RequestBody LoanCreate dto) {
	service.create(dto);
    }

}
