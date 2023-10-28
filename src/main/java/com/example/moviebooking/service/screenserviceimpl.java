package com.example.moviebooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.moviebooking.model.screen;
import com.example.moviebooking.repository.screenrepository;
@Service
public class screenserviceimpl implements screenservice {
	@Autowired
	private screenrepository Screenrepository;
	public screenserviceimpl(screenrepository screenrepository) {
		super();
		Screenrepository = screenrepository;
	}

	@Override
	public List<screen> getAllscreen() {
		return Screenrepository.findAll();
	}

	@Override
	public screen savescreen(screen Screen) {
		return  Screenrepository.save(Screen);
	}

	@Override
	public screen updatescreen(screen Screen, long id) {
		return   Screenrepository.save(Screen);
	}

	@Override
	public void deletescreen(long id) {
		Screenrepository.deleteById(id);
		
	}

}
