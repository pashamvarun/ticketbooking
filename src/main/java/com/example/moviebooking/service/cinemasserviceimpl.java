package com.example.moviebooking.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.moviebooking.model.cinemas;
import com.example.moviebooking.repository.cinemasrepository;
@Transactional
@Service
public class cinemasserviceimpl implements cinemasservice {
	@Autowired
private cinemasrepository Cinemasrepository;

	public cinemasserviceimpl(cinemasrepository cinemasrepository) {
		super();
		Cinemasrepository = cinemasrepository;
	}

	@Override
	public List<cinemas> getAllcinemas() {
		
		return Cinemasrepository.findAll();
	}

	@Override
	public cinemas savecinemas(cinemas Cinemas) {
		
		return Cinemasrepository.save(Cinemas);
	}

	@Override
	public cinemas updatecinemas(cinemas Cinemas, long id) {
		return Cinemasrepository.save(Cinemas);
	}

	@Override
	public void deletecinemas(long id) {
		Cinemasrepository.deleteById(id);
		
	}
	
}
