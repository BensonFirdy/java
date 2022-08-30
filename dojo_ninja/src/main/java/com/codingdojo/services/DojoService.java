package com.codingdojo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.models.Dojo;
import com.codingdojo.repositories.DojoRepository;

@Service
public class DojoService {

	
	@Autowired
	private DojoRepository dojoRepository;
	
	public void create(Dojo dojo) {
		
		dojoRepository.save(dojo);
	}
	
	public ArrayList<Dojo> findAll(){
		
		return (ArrayList<Dojo>)dojoRepository.findAll();
	}

	
	public Dojo findById(Long id) {
		
		return dojoRepository.findById(id).orElse(null);
	}
	
	public void update(Dojo dojo) {
		
		dojoRepository.save(dojo);
	}
	
	public void deleteById(Long id) {
		
		dojoRepository.deleteById(id);
	}
}
