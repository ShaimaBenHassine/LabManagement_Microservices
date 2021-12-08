package com.example.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.OutilRepository;
import com.example.demo.entities.Outil;

@Service
public class OutilServiceImpl implements IOutilService {

	
	@Autowired
	OutilRepository outilRepository;
	
	@Override
	public List<Outil> findAll() {
		return outilRepository.findAll();
	}

	@Override
	public Outil addOutil(Outil o) {
		return outilRepository.save(o);
	}

	@Override
	public void deleteOutil(Long id) {
		if(outilRepository.findById(id).isPresent())
			outilRepository.deleteById(id);
	}

	@Override
	public Outil updateOutil(Outil o) {
		return outilRepository.saveAndFlush(o);
	}

	@Override
	public Outil findOutilById(Long id) {
		Outil o=(Outil)outilRepository.findById(id).get();
		return o;
	}

	@Override
	public List<Outil> findOutilByDate(Date date) {
		return outilRepository.findByDate(date);
	}

	@Override
	public List<Outil> findOutilBySource(String source) {
		return outilRepository.findBySource(source);
	}

}
