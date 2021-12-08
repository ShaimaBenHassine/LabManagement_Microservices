package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Outil;
import com.example.demo.service.IOutilService;

@RestController
public class OutilRestController {
	@Autowired
	IOutilService outilService ;
	
	@RequestMapping(value="/outils", method=RequestMethod.GET)
	
	public List<Outil> findOutils() {
		return outilService.findAll();
	}
	
	@GetMapping(value="/outils/{id}")
	public Outil findOutilById(@PathVariable Long id) {
		return outilService.findOutilById(id);
	}
	
	@GetMapping(value="/outils/source")
	public List<Outil> findOutilBySource(@PathVariable String source) {
		return outilService.findOutilBySource(source);
	}
	
	
	
	
	
	
}
