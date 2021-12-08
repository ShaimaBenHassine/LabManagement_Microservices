package com.example.demo.service;

import java.util.Date;
import java.util.List;

import com.example.demo.entities.Outil;

public interface IOutilService {

	public List<Outil> findAll();

	public Outil addOutil(Outil o);

	public void deleteOutil(Long id);

	public Outil updateOutil(Outil p);

	public Outil findOutilById(Long id);
	
	public List<Outil> findOutilByDate(Date date);
	public List<Outil> findOutilBySource(String source);
	
	
	

}
